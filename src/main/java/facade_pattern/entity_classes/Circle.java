package facade_pattern.entity_classes;

import facade_pattern.interfaces.Shape;

public class Circle implements Shape {

    private int radius;
    private int x;
    private int y;

    public Circle(int radius, int x, int y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }
    public void draw() {
        System.out.println("Drawing Original Circle at ("+x +"," + "y) with radius="+radius+" ...");
    }
}
