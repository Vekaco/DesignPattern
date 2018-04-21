package filter_pattern.demo;

import filter_pattern.entity_classes.Person;
import filter_pattern.entity_filters.*;
import filter_pattern.interfaces.Filter;

import java.util.ArrayList;

public class FilterPatternDemo {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Filter male = new MaleFilter();
        Filter female = new FemaleFilter();
        Filter single = new SingleFilter();

        Filter and = new AndFilter(single, female);
        Filter or = new OrFilter(single, male);

        printPersons(male.meetCondition(persons));
        printPersons(female.meetCondition(persons));
        printPersons(single.meetCondition(persons));
        printPersons(and.meetCondition(persons));
        printPersons(or.meetCondition(persons));

    }

    private static void printPersons(ArrayList<Person> persons) {
        for(Person person: persons) {
            System.out.println(person.toString());
        }
        System.out.println();
    }
}
