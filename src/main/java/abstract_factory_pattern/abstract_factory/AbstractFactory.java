package abstract_factory_pattern.abstract_factory;

import abstract_factory_pattern.interfaces.Color;
import abstract_factory_pattern.interfaces.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
