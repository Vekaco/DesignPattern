package builder_pattern.interfaces;

/**
 * 单品信息
 */
public interface Item {
    String name();
    Packing packing();
    float price();
}
