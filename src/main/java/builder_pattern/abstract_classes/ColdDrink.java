package builder_pattern.abstract_classes;

import builder_pattern.entity_classes.Bottle;
import builder_pattern.interfaces.Item;
import builder_pattern.interfaces.Packing;

/**
 * 冷饮类
 *
 * 打包方式比为瓶装
 */
public abstract class ColdDrink implements Item{
    public Packing packing() {
        return new Bottle();
    }
}
