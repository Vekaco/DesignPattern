package chain_responsibility_pattern.entity_classes;

import chain_responsibility_pattern.abstract_classes.AbstractLogger;

public class FileLog extends AbstractLogger{

    public FileLog(int level) {
        this.level = level;
    }
    protected void printMessage(String message) {
        System.out.println("FileLog: " + message);
    }
}
