package command_pattern.commands;

import command_pattern.receivers.Stock;
import command_pattern.interfaces.Order;

public class BuyStock implements Order{

    private Stock  stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }
    public void execute() {
        stock.buy();
    }
}
