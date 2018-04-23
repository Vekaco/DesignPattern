package null_object_pattern.entity_classes;

import null_object_pattern.abstract_classes.AbstractCustomer;

public class NullCumstomer extends AbstractCustomer{

    public boolean isNil() {
        return true;
    }

    public String getName() {
        return "Not available";
    }
}
