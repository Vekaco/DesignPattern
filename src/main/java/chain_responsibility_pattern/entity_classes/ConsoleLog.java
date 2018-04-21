package chain_responsibility_pattern.entity_classes;

import chain_responsibility_pattern.abstract_classes.AbstractLogger;

public class ConsoleLog extends AbstractLogger{

    public ConsoleLog(int level){
        this.level = level;
    }

    protected void printMessage(String message) {
        System.out.println("ConsoleLog: " + message);
    }
}
