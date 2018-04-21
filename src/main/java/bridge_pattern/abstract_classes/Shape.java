package bridge_pattern.abstract_classes;

import bridge_pattern.interfaces.DrawApi;


public abstract class Shape {
    protected DrawApi drawApi;

    public Shape(DrawApi drawApi){
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
