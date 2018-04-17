package abstract_factory_pattern.interfacesImpl;

import abstract_factory_pattern.interfaces.Shape;

public class Square implements Shape{
    public void draw() {
        System.out.println("Inside Square:: draw() method.");
    }
}
