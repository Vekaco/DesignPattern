package observer_pattern.entity_classes;

import observer_pattern.observers.Observer;

import java.util.ArrayList;

public class Subject {
    private int state;
    ArrayList<Observer> observers = new ArrayList<Observer>();

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public boolean attach(Observer observer){
        return observers.add(observer);
    }

    private void notifyAllObservers(){
        for (Observer observer: observers) {
            observer.update();
        }
    }

}
