package chain_responsibility_pattern.abstract_classes;

public abstract class AbstractLogger {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    protected AbstractLogger nextLogger;
    protected int level;


    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            printMessage(message);
        }
        if(nextLogger != null)
        {
            nextLogger.logMessage(level, message);
        }

    }

    protected abstract void printMessage(String message);

}
