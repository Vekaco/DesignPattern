package observer_pattern.observers;

import observer_pattern.entity_classes.Subject;

public class HexalObserver extends Observer {

    public HexalObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }
    public void update() {
        System.out.println("HexalObserver:" + Integer.toHexString(subject.getState()));

    }
}
