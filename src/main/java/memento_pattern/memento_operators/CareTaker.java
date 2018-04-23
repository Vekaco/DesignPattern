package memento_pattern.memento_operators;

import memento_pattern.memento_object.Memento;

import java.util.ArrayList;

public class CareTaker {
    private static ArrayList<Memento> mementos = new ArrayList<Memento>();

    public boolean add(Memento memento){
        return mementos.add(memento);
    }

    public Memento get(int index){
        return mementos.get(index);
    }
}
