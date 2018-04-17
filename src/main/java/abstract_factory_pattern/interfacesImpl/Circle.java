package abstract_factory_pattern.interfacesImpl;

import abstract_factory_pattern.interfaces.Shape;

public class Circle implements Shape{
    public void draw() {
        System.out.println("Inside Circle:: draw() method.");
    }
}
