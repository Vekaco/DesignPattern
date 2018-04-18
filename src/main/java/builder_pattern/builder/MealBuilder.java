package builder_pattern.builder;

import builder_pattern.entity_classes.ChickenBurger;
import builder_pattern.entity_classes.Coke;
import builder_pattern.entity_classes.Pepsi;
import builder_pattern.entity_classes.VegBurger;

/**
 * 组合套餐
 */
public class MealBuilder {
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

}
