package state_pattern.context_classes;

import state_pattern.interfaces.State;

public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
