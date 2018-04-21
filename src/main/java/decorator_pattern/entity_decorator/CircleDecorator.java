package decorator_pattern.entity_decorator;

import decorator_pattern.abstract_decorators.ShapeDecorator;
import decorator_pattern.interfaces.Shape;

public class CircleDecorator extends ShapeDecorator{

    public CircleDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setBorder();

    }
    private void setBorder(){
        System.out.println("Decorator is setting Border for Circle..");
    }
}
