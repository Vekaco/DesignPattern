package observer_pattern.observers;

import observer_pattern.entity_classes.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();

}
