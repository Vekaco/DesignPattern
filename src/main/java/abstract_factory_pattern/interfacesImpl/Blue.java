package abstract_factory_pattern.interfacesImpl;

import abstract_factory_pattern.interfaces.Color;

public class Blue implements Color{
    public void fill() {
        System.out.println("Inside Blue:: fill() method.");
    }
}
