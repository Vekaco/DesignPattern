package interperter_pattern.demo;

import interperter_pattern.interfaces.Expression;
import interperter_pattern.interperters.AndExpression;
import interperter_pattern.interperters.OrExpression;
import interperter_pattern.interperters.TerminalExpression;

public class InterpreterPatternDemo {
    public static void main(String[] args) {

        System.out.println("Is John Male?");
        System.out.println(isMale().interpert("John"));


        System.out.println("Does Julia get Married?");
        System.out.println(isMarried().interpert("Julia Married"));

    }

    public static Expression isMale(){
        TerminalExpression robert = new TerminalExpression("Robert");
        TerminalExpression john = new TerminalExpression("John");

        return new OrExpression(robert,john);

    }

    public static Expression isMarried(){
        TerminalExpression Julia = new TerminalExpression("Julia");
        TerminalExpression married = new TerminalExpression("Married");
        return new AndExpression(Julia, married);
    }
}
