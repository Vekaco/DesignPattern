package bridge_pattern.entity_classes;

import bridge_pattern.interfaces.DrawApi;

public class RedCircleTool implements DrawApi{

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Red Circle at (" + x + "," + y+ ") with radius=" + radius);
    }
}
