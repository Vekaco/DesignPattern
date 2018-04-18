package builder_pattern.entity_classes;

import builder_pattern.abstract_classes.Burger;

public class VegBurger extends Burger{

    public String name() {
        return "VegBurger";
    }

    public float price() {
        return 10.0f;
    }
}
