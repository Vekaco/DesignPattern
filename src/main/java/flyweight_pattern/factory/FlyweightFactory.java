package flyweight_pattern.factory;

import flyweight_pattern.entity_classes.Circle;

import java.util.Hashtable;

public class FlyweightFactory {
    private static final Hashtable<String, Circle> circles = new Hashtable<String, Circle>();

    public Circle getCircle(String color){
        Circle circle = circles.get(color);

        if(circle == null){
            circle = new Circle(color);
            circles.put(color,circle);
        }
        return circle;
    }
}
