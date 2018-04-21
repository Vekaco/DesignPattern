package facade_pattern.entity_classes;

import facade_pattern.interfaces.Shape;

public class Square implements Shape{
    private int x;

    public Square(int x) {
        this.x = x;
    }
    public void draw() {
        System.out.println("Drawing Square x = " + x);
    }
}
