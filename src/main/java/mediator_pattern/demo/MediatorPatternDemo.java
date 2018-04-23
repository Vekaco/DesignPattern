package mediator_pattern.demo;

import mediator_pattern.entity_classes.User;

public class MediatorPatternDemo {

    public static void main(String[] args) {
        User tom = new User("Tom");
        tom.sendMessage("Hi Andy, Are you there?");

        User andy = new User("Andy");
        andy.sendMessage("Hi Tom, What's up?");

    }
}
