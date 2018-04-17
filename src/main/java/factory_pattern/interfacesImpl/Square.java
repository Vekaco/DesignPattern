package factory_pattern.interfacesImpl;

import factory_pattern.interfaces.Shape;

public class Square implements Shape{
    public void draw() {
        System.out.println("Inside Square:: draw() method.");
    }
}
