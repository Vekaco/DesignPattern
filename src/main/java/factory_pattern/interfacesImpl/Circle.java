package factory_pattern.interfacesImpl;

import factory_pattern.interfaces.Shape;

public class Circle implements Shape{
    public void draw() {
        System.out.println("Inside Circle:: draw() method.");
    }
}
