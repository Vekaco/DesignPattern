package service_locator_pattern.context;

import service_locator_pattern.services.Service;
import service_locator_pattern.services.Service1;
import service_locator_pattern.services.Service2;

public class InitialContext {

    public static Service lookup(String serviceType) {
        if("Service1".equalsIgnoreCase(serviceType)) {
            System.out.println("looking up...");
            return new Service1();
        } else{
            System.out.println("looking up...");
            return new Service2();
        }
    }
}
