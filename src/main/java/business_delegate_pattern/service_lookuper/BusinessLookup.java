package business_delegate_pattern.service_lookuper;

import business_delegate_pattern.services.BusinessService;
import business_delegate_pattern.services.EJBService;
import business_delegate_pattern.services.JMSService;

public class BusinessLookup {

    public BusinessService getService(String serviceType){

        if("EJB".equalsIgnoreCase(serviceType)) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }

}
