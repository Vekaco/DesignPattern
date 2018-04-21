package decorator_pattern.abstract_decorators;

import decorator_pattern.interfaces.Shape;

public abstract class ShapeDecorator implements Shape{
    Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    public void draw(){
        decoratedShape.draw();
    }
}
