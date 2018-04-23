package state_pattern.state_classes;

import state_pattern.context_classes.Context;
import state_pattern.interfaces.State;

public class StartState implements State{
    public void doAction(Context context) {
        System.out.println("do action in start...");
        context.setState(this);
    }

    public String toString(){
        return "Start State";
    }
}
