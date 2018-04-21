package decorator_pattern.demo;

import decorator_pattern.entity_classes.Circle;
import decorator_pattern.entity_decorator.CircleDecorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Circle circle = new Circle(2,2,2);
        CircleDecorator circleDecorator = new CircleDecorator(circle);

        circleDecorator.draw();
    }
}
