package builder_pattern.entity_classes;

import builder_pattern.abstract_classes.Burger;

public class ChickenBurger extends Burger{

    public String name() {
        return "ChickenBurger";
    }

    public float price() {
        return 15.5f;
    }
}
