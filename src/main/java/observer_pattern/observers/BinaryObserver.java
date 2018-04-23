package observer_pattern.observers;

import observer_pattern.entity_classes.Subject;

public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println("BinaryObserver:" + Integer.toBinaryString(subject.getState()));
    }
}
