package builder_pattern.entity_classes;

import builder_pattern.abstract_classes.ColdDrink;

public class Pepsi extends ColdDrink{
    public String name() {
        return "Pepsi";
    }

    public float price() {
        return 6.0f;
    }
}
