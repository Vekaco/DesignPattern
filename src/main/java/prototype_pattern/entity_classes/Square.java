package prototype_pattern.entity_classes;

import prototype_pattern.abstract_classes.Shape;

public class Square extends Shape{
    public Square() {
        type = "Square";
    }
    protected void draw() {
        System.out.println("Inside Square:: draw() method.");
    }
}
