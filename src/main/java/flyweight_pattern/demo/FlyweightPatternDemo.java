package flyweight_pattern.demo;

import flyweight_pattern.entity_classes.Circle;
import flyweight_pattern.factory.FlyweightFactory;

public class FlyweightPatternDemo {
    private static final String[] colors = new String[]{"blue", "red", "yellow", "green", "white"};
    public static void main(String[] args) {


        FlyweightFactory factory = new FlyweightFactory();
        for(int i=0; i<20; i++) {
            Circle circle = factory.getCircle(getRandomColor());
            circle.setRadius(getRandomRadius());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }


    }

    private static String getRandomColor(){
        return colors[(int)(Math.random() * colors.length)];
    }

    private static int getRandomRadius(){
        return (int)(Math.random() * 100);
    }
    private static int getRandomX(){
        return (int)(Math.random() * 100);
    }
    private static int getRandomY(){
        return (int)(Math.random() * 100);
    }
}
