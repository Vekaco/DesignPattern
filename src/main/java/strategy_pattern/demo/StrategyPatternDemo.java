package strategy_pattern.demo;

import strategy_pattern.context.Context;
import strategy_pattern.strategies.OperationAdd;
import strategy_pattern.strategies.OperationMultiply;
import strategy_pattern.strategies.OperationSubstract;

public class StrategyPatternDemo {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 2 = " + context.executeStrategy(10,2));

        context = new Context(new OperationSubstract());
        System.out.println("15 - 3 = " + context.executeStrategy(15,3));

        context = new Context(new OperationMultiply());
        System.out.println("3 * 4 =" + context.executeStrategy(3,4));
        


    }
}
