package business_delegate_pattern.business_delegate;

import business_delegate_pattern.service_lookuper.BusinessLookup;
import business_delegate_pattern.services.BusinessService;

public class BusinessDelegate {

    private String serviceType;
    private BusinessLookup lookup = new BusinessLookup();
    private BusinessService service;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask(){
        service = lookup.getService(serviceType);
        service.doProcessing();
    }

}
