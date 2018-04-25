package business_delegate_pattern.demo;

import business_delegate_pattern.business_delegate.BusinessDelegate;
import business_delegate_pattern.client.Client;

public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doProcessing();

        businessDelegate.setServiceType("JMS");
        client.doProcessing();
    }
}
