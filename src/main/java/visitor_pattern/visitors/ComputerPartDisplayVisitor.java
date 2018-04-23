package visitor_pattern.visitors;

import visitor_pattern.interfaces.ComputerPartVisitor;
import visitor_pattern.respondents.Computer;
import visitor_pattern.respondents.Keyboard;
import visitor_pattern.respondents.Monitor;
import visitor_pattern.respondents.Mouse;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

    public void visit(Mouse mouse) {
        System.out.println("displaying Mouse");

    }

    public void visit(Keyboard keyboard) {
        System.out.println("displaying Keyboard");
    }

    public void visit(Monitor monitor) {

        System.out.println("displaying Monitor");
    }

    public void visit(Computer computer) {
        System.out.println("displaying Computer");
    }
}
