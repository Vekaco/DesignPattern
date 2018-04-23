package strategy_pattern.context;

import strategy_pattern.strategy_interfaces.Strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2) {
        return strategy.doOption(num1, num2);
    }
}
