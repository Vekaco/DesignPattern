package builder_pattern.entity_classes;

import builder_pattern.abstract_classes.ColdDrink;

public class Coke extends ColdDrink{
    public String name() {
        return "Coke";
    }

    public float price() {
        return 6.5f;
    }
}
