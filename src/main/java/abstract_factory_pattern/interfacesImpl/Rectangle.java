package abstract_factory_pattern.interfacesImpl;

import abstract_factory_pattern.interfaces.Shape;

public class Rectangle implements Shape{
    public void draw() {
        System.out.println("Inside Rectangle:: draw() method.");
    }
}
