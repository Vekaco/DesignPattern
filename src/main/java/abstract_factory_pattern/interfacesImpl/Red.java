package abstract_factory_pattern.interfacesImpl;

import abstract_factory_pattern.interfaces.Color;

public class Red implements Color{
    public void fill() {
        System.out.println("Inside Red:: fill() method.");
    }
}
