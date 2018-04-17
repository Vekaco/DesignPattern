package abstract_factory_pattern.factory;

import abstract_factory_pattern.abstract_factory.AbstractFactory;
import abstract_factory_pattern.interfaces.Color;
import abstract_factory_pattern.interfaces.Shape;
import abstract_factory_pattern.interfacesImpl.Circle;
import abstract_factory_pattern.interfacesImpl.Rectangle;
import abstract_factory_pattern.interfacesImpl.Square;

public class ShapeFactory extends AbstractFactory{
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shape) {
        if(shape == null){
            return null;
        }
        if("Rectangle".equalsIgnoreCase(shape)){
            return new Rectangle();
        }
        if("Circle".equalsIgnoreCase(shape)){
            return new Circle();
        }
        if("Square".equalsIgnoreCase(shape)){
            return new Square();
        }
        return null;
    }
}
