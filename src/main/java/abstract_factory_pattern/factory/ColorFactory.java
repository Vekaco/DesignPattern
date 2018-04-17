package abstract_factory_pattern.factory;

import abstract_factory_pattern.abstract_factory.AbstractFactory;
import abstract_factory_pattern.interfaces.Color;
import abstract_factory_pattern.interfaces.Shape;
import abstract_factory_pattern.interfacesImpl.Blue;
import abstract_factory_pattern.interfacesImpl.Green;
import abstract_factory_pattern.interfacesImpl.Red;

public class ColorFactory extends AbstractFactory{

    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if("Blue".equalsIgnoreCase(color)){
            return new Blue();
        }
        if("Red".equalsIgnoreCase(color)){
            return new Red();
        }
        if("Green".equalsIgnoreCase(color)){
            return new Green();
        }
        return null;
    }

    public Shape getShape(String shape) {
        return null;
    }
}
