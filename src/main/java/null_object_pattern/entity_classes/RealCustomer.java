package null_object_pattern.entity_classes;

import null_object_pattern.abstract_classes.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }
    public boolean isNil() {
        return false;
    }

    public String getName() {
        return name;
    }
}
