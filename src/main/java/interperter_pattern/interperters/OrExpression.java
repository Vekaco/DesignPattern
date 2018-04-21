package interperter_pattern.interperters;

import interperter_pattern.interfaces.Expression;

public class OrExpression implements Expression{

    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
    public boolean interpert(String context) {
        return expression1.interpert(context) || expression2.interpert(context);
    }
}
