package flyweight_pattern.entity_classes;

import flyweight_pattern.interfaces.Shape;

public class Circle implements Shape {

    private int radius;
    private int x;
    private int y;
    private String color;

    public Circle(String color){
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw() {
        System.out.println("Drawing " + color + " circle at (" + x + "," +y +") with radius=" + radius);
    }
}
