package composite_pattern.entity_classes;

import java.util.ArrayList;

public class Employee {
    private String name;
    private String dept;
    private int salary;

    private ArrayList<Employee> subOrdinates;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;

        this.subOrdinates = new ArrayList<Employee>();
    }

    public boolean add(Employee e){
        return subOrdinates.add(e);
    }

    public boolean remove(Employee e) {
        return subOrdinates.remove(e);
    }

    public ArrayList<Employee> getSubordinates(){
        return subOrdinates;
    }

    public String toString(){
        return "[Name:" + name + ", Dept:" + dept +", Salary:"+salary+"]";
    }
}
