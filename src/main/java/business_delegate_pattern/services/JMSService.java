package business_delegate_pattern.services;

public class JMSService implements BusinessService{
    public void doProcessing() {
        System.out.println("JMS Service Processing...");
    }
}
