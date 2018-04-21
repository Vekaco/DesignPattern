package facade_pattern.demo;

import facade_pattern.facade_classes.ShapeMaker;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker maker = new ShapeMaker();
        maker.draw();
    }
}
