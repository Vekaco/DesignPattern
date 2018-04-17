package factory_pattern.interfacesImpl;

import factory_pattern.interfaces.Shape;

public class Rectangle implements Shape{
    public void draw() {
        System.out.println("Inside Rectangle:: draw() method.");
    }
}
