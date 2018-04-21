package chain_responsibility_pattern.demo;

import chain_responsibility_pattern.abstract_classes.AbstractLogger;
import chain_responsibility_pattern.entity_classes.ConsoleLog;
import chain_responsibility_pattern.entity_classes.ErrorLog;
import chain_responsibility_pattern.entity_classes.FileLog;

public class ChainResponsibilityPatternDemo {

    public static void main(String[] args) {
        ConsoleLog consoleLog = new ConsoleLog(AbstractLogger.INFO);
        FileLog fileLog = new FileLog(AbstractLogger.DEBUG);
        ErrorLog errorLog = new ErrorLog(AbstractLogger.ERROR);

        errorLog.setNextLogger(fileLog);
        fileLog.setNextLogger(consoleLog);

        consoleLog.logMessage(AbstractLogger.INFO,"This is console message!");

        fileLog.logMessage(AbstractLogger.DEBUG, "This is Debug message!");

        errorLog.logMessage(AbstractLogger.ERROR,"This is Error message");

    }
}
