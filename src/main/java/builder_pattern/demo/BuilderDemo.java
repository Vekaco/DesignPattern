package builder_pattern.demo;

import builder_pattern.builder.Meal;
import builder_pattern.builder.MealBuilder;

public class BuilderDemo {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();

        Meal nonVegMeal = builder.prepareNonVegMeal();
        Meal vegMeal = builder.prepareVegMeal();

        System.out.println("NonVeg Meal cost:" + nonVegMeal.price());
        System.out.println("Details:");
        nonVegMeal.showItems();

        System.out.println();

        System.out.println("Veg Meal cost:" + vegMeal.price());
        System.out.println("Details:");
        vegMeal.showItems();

    }
}
