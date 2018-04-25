package service_locator_pattern.demo;

import service_locator_pattern.locator.ServiceLocator;
import service_locator_pattern.services.Service;

public class ServiceLocatorPattern {

    public static void main(String[] args) {
        ServiceLocator locator = new ServiceLocator();
        Service service = locator.getService("Service1");
        service.execute();
        service.execute();
    }
}
