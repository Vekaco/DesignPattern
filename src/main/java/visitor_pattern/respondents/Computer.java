package visitor_pattern.respondents;

import visitor_pattern.interfaces.ComputerPart;
import visitor_pattern.interfaces.ComputerPartVisitor;

public class Computer implements ComputerPart{

    private ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[]{new Monitor(), new Keyboard(), new Mouse()};
    }
    public void accept(ComputerPartVisitor visitor) {
        for(ComputerPart part: parts) {
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
