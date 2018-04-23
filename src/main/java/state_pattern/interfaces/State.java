package state_pattern.interfaces;

import state_pattern.context_classes.Context;

public interface State {
    void doAction(Context context);
}
