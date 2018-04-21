package bridge_pattern.demo;

import bridge_pattern.entity_classes.Circle;
import bridge_pattern.entity_classes.GreenCircleTool;
import bridge_pattern.entity_classes.RedCircleTool;

public class BridgePatternDemo {
    public static void main(String[] args) {
        GreenCircleTool greenCircleTool = new GreenCircleTool();
        RedCircleTool redCircleTool = new RedCircleTool();

        Circle greenCircle = new Circle(1,2,3, greenCircleTool);
        Circle redCircle = new Circle(2,2,4, redCircleTool);

        greenCircle.draw();
        redCircle.draw();
    }
}
