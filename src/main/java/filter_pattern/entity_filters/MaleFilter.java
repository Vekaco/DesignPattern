package filter_pattern.entity_filters;

import filter_pattern.entity_classes.Person;
import filter_pattern.interfaces.Filter;

import java.util.ArrayList;

public class MaleFilter implements Filter<Person>{

    public ArrayList<Person> meetCondition(ArrayList<Person> persons) {
        ArrayList<Person> males = new ArrayList<Person>();
        for(Person person: persons){
            if("male".equalsIgnoreCase(person.getGender())){
                males.add(person);
            }
        }

        return males;
    }
}
