package service_locator_pattern.cache;

import service_locator_pattern.services.Service;

import java.util.ArrayList;
import java.util.List;

public class Cache {

    private static final List<Service> services = new ArrayList<Service>();

    public Service getService(String serviceType){
        for(Service service: services) {
            if(service.getName().equalsIgnoreCase(serviceType)) {
                return service;
            }
        }
        return null;
    }
}
