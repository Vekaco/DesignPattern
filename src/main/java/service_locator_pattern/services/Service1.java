package service_locator_pattern.services;

public class Service1 implements Service {
    public String getName() {
        return "Service1";
    }

    public void execute() {
        System.out.println("executing Service1...");
    }
}
