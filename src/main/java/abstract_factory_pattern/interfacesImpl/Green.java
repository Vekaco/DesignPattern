package abstract_factory_pattern.interfacesImpl;

import abstract_factory_pattern.interfaces.Color;

public class Green implements Color{
    public void fill() {
        System.out.println("Inside Green:: fill() method.");
    }
}
