package bridge_pattern.entity_classes;

import bridge_pattern.interfaces.DrawApi;

public class GreenCircleTool implements DrawApi{

    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Green Circle at (" + x + "," + y+ ") with radius=" + radius);
    }
}
