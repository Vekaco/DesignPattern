package interperter_pattern.interperters;

import interperter_pattern.interfaces.Expression;

public class TerminalExpression implements Expression{
    private String data;

    public TerminalExpression(String data){
        this.data = data;
    }
    public boolean interpert(String context) {
        if(context.contains(data)){
            return true;
        }
        return false;
    }
}
