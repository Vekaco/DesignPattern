package filter_pattern.entity_filters;

import filter_pattern.entity_classes.Person;
import filter_pattern.interfaces.Filter;

import java.util.ArrayList;

public class SingleFilter implements Filter<Person>{

    public ArrayList<Person> meetCondition(ArrayList<Person> persons) {
        ArrayList<Person> single = new ArrayList<Person>();

        for(Person person: persons){
            if("single".equalsIgnoreCase(person.getMeritialStatus())){
                single.add(person);
            }
        }
        return single;
    }
}
