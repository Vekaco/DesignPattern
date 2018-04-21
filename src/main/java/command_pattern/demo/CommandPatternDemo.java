package command_pattern.demo;

import command_pattern.commands.BuyStock;
import command_pattern.commands.SellStock;
import command_pattern.invokers.Broker;
import command_pattern.receivers.Stock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Broker broker = new Broker();

        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrder();
    }
}
