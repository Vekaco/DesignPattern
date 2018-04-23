package strategy_pattern.strategies;

import strategy_pattern.strategy_interfaces.Strategy;

public class OperationMultiply implements Strategy{
    public int doOption(int num1, int num2) {
        return num1 * num2;
    }
}
