package service_locator_pattern.locator;

import service_locator_pattern.cache.Cache;
import service_locator_pattern.context.InitialContext;
import service_locator_pattern.services.Service;

public class ServiceLocator {

    Cache cache = new Cache();

    public Service getService(String serviceType) {
        Service service = cache.getService(serviceType);
        if(service == null) {
            service = InitialContext.lookup(serviceType);
        }
        return service;
    }
}
