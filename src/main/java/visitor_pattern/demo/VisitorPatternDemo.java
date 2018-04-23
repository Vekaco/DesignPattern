package visitor_pattern.demo;

import visitor_pattern.interfaces.ComputerPartVisitor;
import visitor_pattern.respondents.Computer;
import visitor_pattern.visitors.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {
        ComputerPartVisitor visitor = new ComputerPartDisplayVisitor();
        Computer computer = new Computer();

        computer.accept(visitor);
    }
}
