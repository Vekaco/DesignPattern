package prototype_pattern.demo;

import prototype_pattern.abstract_classes.Shape;
import prototype_pattern.entity_classes.ShapeCache;

public class PrototypePatternDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        ShapeCache shapeCache = new ShapeCache();
        shapeCache.loadShapes();


        Shape shape1 = shapeCache.getShape("1");
        Shape shape2 = shapeCache.getShape("2");
        Shape shape3 = shapeCache.getShape("3");

        System.out.println(shape1.getId() + ":" + shape1.getType());
        System.out.println(shape2.getId() + ":" + shape2.getType());
        System.out.println(shape3.getId() + ":" + shape3.getType());
    }
}
