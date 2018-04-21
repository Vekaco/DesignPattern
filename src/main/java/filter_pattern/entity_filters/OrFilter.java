package filter_pattern.entity_filters;

import filter_pattern.entity_classes.Person;
import filter_pattern.interfaces.Filter;

import java.util.ArrayList;

public class OrFilter implements Filter<Person>{
    private Filter f1;
    private Filter f2;

    public OrFilter(Filter f1, Filter f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    public ArrayList<Person> meetCondition(ArrayList<Person> persons) {
        ArrayList<Person> personsF1 = new ArrayList<Person>();
        ArrayList<Person> personsF2 = new ArrayList<Person>();

        personsF1 = f1.meetCondition(persons);
        personsF2 = f2.meetCondition(persons);

        for(Person person: personsF1){

            if(!personsF2.contains(person)){
                personsF2.add(person);
            }
        }

        return personsF2;
    }
}
