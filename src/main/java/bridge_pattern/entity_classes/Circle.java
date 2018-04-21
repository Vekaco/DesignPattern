package bridge_pattern.entity_classes;

import bridge_pattern.abstract_classes.Shape;
import bridge_pattern.interfaces.DrawApi;

public class Circle extends Shape{
    private int x;
    private int y;
    private int radius;

    public Circle(int radius, int x, int y, DrawApi drawApi) {
        super(drawApi);

        this.radius = radius;
        this.x = x;
        this.y = y;

        this.drawApi = drawApi;
    }

    public void draw() {

        drawApi.drawCircle(radius, x, y);
    }
}
