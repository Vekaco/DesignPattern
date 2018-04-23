package mediator_pattern.entity_classes;

import mediator_pattern.mediator_classes.Mediator;

public class User {

    private String name;


    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message){
        Mediator.showMessage(this, message);
    }
}
