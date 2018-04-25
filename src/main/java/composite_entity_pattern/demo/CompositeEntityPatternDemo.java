package composite_entity_pattern.demo;

import composite_entity_pattern.client.Client;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("1","1");
        client.printData();

    }
}
