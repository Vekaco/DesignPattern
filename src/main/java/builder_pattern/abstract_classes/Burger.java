package builder_pattern.abstract_classes;

import builder_pattern.entity_classes.Wrapper;
import builder_pattern.interfaces.Item;
import builder_pattern.interfaces.Packing;

/**
 * 汉堡类
 *
 * 打包方式比为纸盒包装
 */
public abstract class Burger implements Item{

    public Packing packing() {
        return new Wrapper();
    }
}
