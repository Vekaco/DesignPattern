package template_pattern.entity_classes;

import template_pattern.template.Game;

public class Football extends Game{
    public void initialize() {
        System.out.println("initializing Football...");
    }

    public void startPlay() {
        System.out.println("starting Football...");
    }

    public void endPlay() {
        System.out.println("ending Football...");

    }
}
