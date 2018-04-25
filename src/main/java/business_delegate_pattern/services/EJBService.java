package business_delegate_pattern.services;

public class EJBService implements BusinessService{
    public void doProcessing() {
        System.out.println("EJB Service Processing...");
    }
}
