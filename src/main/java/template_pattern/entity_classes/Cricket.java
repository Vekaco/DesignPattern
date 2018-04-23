package template_pattern.entity_classes;

import template_pattern.template.Game;

public class Cricket extends Game {

    public void initialize() {
        System.out.println("initializing Cricket... ");

    }

    public void startPlay() {
        System.out.println("starting Cricket...");

    }

    public void endPlay() {
        System.out.println("ending Cricket...");

    }
}
