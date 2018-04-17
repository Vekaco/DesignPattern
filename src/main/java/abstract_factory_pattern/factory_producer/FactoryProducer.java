package abstract_factory_pattern.factory_producer;

import abstract_factory_pattern.abstract_factory.AbstractFactory;
import abstract_factory_pattern.factory.ColorFactory;
import abstract_factory_pattern.factory.ShapeFactory;

public class FactoryProducer {
    public AbstractFactory getFactory(String factory){
        if(factory == null) {
            return null;
        }

        if("ColorFactory".equalsIgnoreCase(factory)) {
            return new ColorFactory();
        }

        if("ShapeFactory".equalsIgnoreCase(factory)) {
            return new ShapeFactory();
        }
        return null;
    }
}
