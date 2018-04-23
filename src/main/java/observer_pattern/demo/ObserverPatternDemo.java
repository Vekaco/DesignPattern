package observer_pattern.demo;

import observer_pattern.entity_classes.Subject;
import observer_pattern.observers.BinaryObserver;
import observer_pattern.observers.HexalObserver;
import observer_pattern.observers.OctalObserver;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexalObserver(subject);
        new OctalObserver(subject);


        subject.setState(11);
        subject.setState(4);
    }
}
