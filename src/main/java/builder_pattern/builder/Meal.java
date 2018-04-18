package builder_pattern.builder;

import builder_pattern.interfaces.Item;

import java.util.ArrayList;

public class Meal {
    ArrayList<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float price(){
        float cost = 0.0f;
        for(Item item: items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for(Item item: items){
            System.out.println(item.name() + "(" + item.packing().pack() + "):" + item.price());
        }
    }
}
