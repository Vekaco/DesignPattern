package visitor_pattern.interfaces;

public interface ComputerPart {
    void accept(ComputerPartVisitor visitor);
}
