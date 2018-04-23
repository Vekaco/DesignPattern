package null_object_pattern.demo;

import null_object_pattern.abstract_classes.AbstractCustomer;
import null_object_pattern.factory_classes.CustomerFactory;

public class NullObjectPatternDemo {
    public static void main(String[] args) {
        CustomerFactory factory = new CustomerFactory();
        AbstractCustomer real = factory.getCustomer("Julia");
        AbstractCustomer nil = factory.getCustomer("Sam");

        System.out.println(real.getName());
        System.out.println(nil.getName());
    }
}
