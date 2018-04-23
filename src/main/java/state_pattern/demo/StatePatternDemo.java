package state_pattern.demo;

import state_pattern.context_classes.Context;
import state_pattern.state_classes.StartState;
import state_pattern.state_classes.StopState;

public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();
        StartState start = new StartState();
        StopState stop = new StopState();

        start.doAction(context);
        System.out.println(context.getState());

        stop.doAction(context);
        System.out.println(context.getState());

    }
}
