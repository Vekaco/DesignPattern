package prototype_pattern.entity_classes;

import prototype_pattern.abstract_classes.Shape;

public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }
    protected void draw() {
        System.out.println("Inside Rectangle:: draw() method.");
    }
}
