package factory_pattern.demo;

import factory_pattern.factory.ShapeFactory;
import factory_pattern.interfaces.Shape;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("Circle");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        Shape square = shapeFactory.getShape("Square");
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
