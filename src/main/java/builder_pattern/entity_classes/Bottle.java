package builder_pattern.entity_classes;

import builder_pattern.interfaces.Packing;

/**
 * 瓶装
 */
public class Bottle implements Packing{
    public String pack() {
        return "Bottle";
    }
}
