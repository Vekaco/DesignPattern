package template_pattern.demo;

import template_pattern.entity_classes.Cricket;
import template_pattern.entity_classes.Football;

public class TemplatePatternDemo {
    public static void main(String[] args) {
        Cricket cricket = new Cricket();
        cricket.play();

        Football football = new Football();
        football.play();
    }
}
