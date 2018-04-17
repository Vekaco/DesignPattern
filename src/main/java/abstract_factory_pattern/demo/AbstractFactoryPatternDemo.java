package abstract_factory_pattern.demo;

import abstract_factory_pattern.abstract_factory.AbstractFactory;
import abstract_factory_pattern.factory_producer.FactoryProducer;
import abstract_factory_pattern.interfaces.Color;
import abstract_factory_pattern.interfaces.Shape;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        FactoryProducer factoryProducer = new FactoryProducer();


        AbstractFactory colorFactory = factoryProducer.getFactory("ColorFactory");
        AbstractFactory shapeFactory = factoryProducer.getFactory("ShapeFactory");

        Color red = colorFactory.getColor("Red");
        Color blue = colorFactory.getColor("Blue");
        Color green = colorFactory.getColor("Green");

        Shape circle = shapeFactory.getShape("Circle");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        Shape square = shapeFactory.getShape("Square");


        red.fill();
        blue.fill();
        green.fill();

        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
