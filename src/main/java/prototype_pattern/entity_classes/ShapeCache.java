package prototype_pattern.entity_classes;

import prototype_pattern.abstract_classes.Shape;

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, Shape> shapes = new Hashtable<String, Shape>();

    public static Shape getShape(String id) throws CloneNotSupportedException {
        Shape shape = shapes.get(id);
        return (Shape) shape.clone();
    }

    public static void loadShapes(){
        Circle circle = new Circle();
        circle.setId("1");
        shapes.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapes.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        shapes.put(square.getId(),square);

    }


}
