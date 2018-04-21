package command_pattern.commands;

import command_pattern.receivers.Stock;
import command_pattern.interfaces.Order;

public class SellStock implements Order{
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }
    public void execute() {
        stock.sell();
    }
}
