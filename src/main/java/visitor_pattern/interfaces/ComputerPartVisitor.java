package visitor_pattern.interfaces;

import visitor_pattern.respondents.Computer;
import visitor_pattern.respondents.Keyboard;
import visitor_pattern.respondents.Monitor;
import visitor_pattern.respondents.Mouse;

public interface ComputerPartVisitor {
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
    void visit(Computer computer);
}
