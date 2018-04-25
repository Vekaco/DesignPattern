package service_locator_pattern.services;

public class Service2 implements Service {
    public String getName() {
        return "Service2";
    }

    public void execute() {
        System.out.println("executing Service2...");
    }
}
