package mediator_pattern.mediator_classes;

import mediator_pattern.entity_classes.User;

import java.util.Date;

public class Mediator {
    public static void showMessage(User user, String message){
        System.out.println("[" + new Date() + "]" + user.getName() + ":" + message);
    }
}
