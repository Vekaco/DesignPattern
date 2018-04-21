package facade_pattern.entity_classes;

import facade_pattern.interfaces.Shape;

public class Rectangle implements Shape{
    private int x;
    private int y;

    public Rectangle(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void draw() {
        System.out.println("Drawing Rectangle[x=" + x +",y=" +y +"]" );
    }
}
