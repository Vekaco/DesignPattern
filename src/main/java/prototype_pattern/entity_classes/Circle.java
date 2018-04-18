package prototype_pattern.entity_classes;

import prototype_pattern.abstract_classes.Shape;

public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }
    protected void draw() {
        System.out.println("Inside Circle:: draw() method.");
    }
}
