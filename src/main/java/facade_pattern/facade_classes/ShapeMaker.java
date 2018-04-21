package facade_pattern.facade_classes;

import decorator_pattern.entity_classes.Circle;
import facade_pattern.entity_classes.Rectangle;
import facade_pattern.entity_classes.Square;

public class ShapeMaker {
    private Circle circle;
    private Square square;
    private Rectangle rectangle;

    public ShapeMaker(){
        circle = new Circle(1,2,1);
        square = new Square(1);
        rectangle = new Rectangle(1,2);
    }

    public void draw(){
        circle.draw();
        square.draw();
        rectangle.draw();
    }
}
