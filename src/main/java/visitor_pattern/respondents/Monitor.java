package visitor_pattern.respondents;

import visitor_pattern.interfaces.ComputerPart;
import visitor_pattern.interfaces.ComputerPartVisitor;

public class Monitor implements ComputerPart{
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
