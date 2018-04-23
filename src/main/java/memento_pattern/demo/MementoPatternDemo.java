package memento_pattern.demo;

import memento_pattern.memento_operators.CareTaker;
import memento_pattern.memento_operators.Originator;

public class MementoPatternDemo {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Originator originator = new Originator();
        originator.setState("S1");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("S2");
        careTaker.add(originator.saveStateToMemento());


        originator.getStateFromMemento(careTaker.get(0));
        System.out.println(originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println(originator.getState());

    }


}
