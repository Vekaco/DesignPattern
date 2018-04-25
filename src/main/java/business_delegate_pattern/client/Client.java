package business_delegate_pattern.client;

import business_delegate_pattern.business_delegate.BusinessDelegate;

public class Client {
    private BusinessDelegate service;

    public Client(BusinessDelegate service) {
        this.service = service;
    }

    public void doProcessing(){
        service.doTask();
    }

}
