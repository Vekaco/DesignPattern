package filter_pattern.entity_filters;

import filter_pattern.entity_classes.Person;
import filter_pattern.interfaces.Filter;

import java.util.ArrayList;

public class AndFilter implements Filter<Person>{
    private Filter f1;
    private Filter f2;

    public AndFilter(Filter f1, Filter f2){
        this.f1 = f1;
        this.f2 = f2;
    }

    public ArrayList<Person> meetCondition(ArrayList<Person> persons) {

        persons = f1.meetCondition(persons);

        return f2.meetCondition(persons);
    }
}
