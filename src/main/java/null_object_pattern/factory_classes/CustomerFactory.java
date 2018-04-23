package null_object_pattern.factory_classes;

import null_object_pattern.abstract_classes.AbstractCustomer;
import null_object_pattern.entity_classes.NullCumstomer;
import null_object_pattern.entity_classes.RealCustomer;

public class CustomerFactory {

    private static final String[] NAMES = new String[]{"Tom", "Julia","Andy"};

    public AbstractCustomer getCustomer(String customer) {
        if(customer != null) {
            for(String name: NAMES) {
                if(name.equalsIgnoreCase(customer)) {
                    return new RealCustomer(customer);
                }
            }
        }
        return  new NullCumstomer();
    }
}
