package observer_pattern.observers;

import observer_pattern.entity_classes.Subject;

public class OctalObserver extends Observer{

    public OctalObserver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    public void update() {
        System.out.println("OctalObserver:" + Integer.toOctalString(subject.getState()));
    }
}
