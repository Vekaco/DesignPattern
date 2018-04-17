package factory_pattern.factory;

import factory_pattern.interfaces.Shape;
import factory_pattern.interfacesImpl.Circle;
import factory_pattern.interfacesImpl.Rectangle;
import factory_pattern.interfacesImpl.Square;

public class ShapeFactory {
    public Shape getShape(String shape){

        if(shape == null) {
            return null;
        }

        if(shape.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        if(shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        if(shape.equalsIgnoreCase("Square")) {
            return new Square();
        }

        return null;
    }

}
