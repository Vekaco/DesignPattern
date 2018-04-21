package filter_pattern.entity_filters;

import filter_pattern.entity_classes.Person;
import filter_pattern.interfaces.Filter;

import java.util.ArrayList;

public class FemaleFilter implements Filter<Person>{
    public ArrayList<Person> meetCondition(ArrayList<Person> persons) {
        ArrayList<Person> females = new ArrayList<Person>();
        for(Person person: persons){
            if("females".equalsIgnoreCase(person.getGender())){
                females.add(person);
            }
        }
        return females;
    }
}
