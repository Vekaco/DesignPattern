package builder_pattern.entity_classes;

import builder_pattern.interfaces.Packing;

/**
 * 纸盒包装
 */
public class Wrapper implements Packing{
    public String pack() {
        return "Wrapper";
    }
}
