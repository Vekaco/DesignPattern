package command_pattern.invokers;

import command_pattern.interfaces.Order;

import java.util.ArrayList;

public class Broker {
    ArrayList<Order> orders = new ArrayList<Order>();

    public boolean takeOrder(Order order) {
        return orders.add(order);
    }

    public void placeOrder(){
        for(Order order: orders) {
            order.execute();
        }
        orders.clear();
    }


}
