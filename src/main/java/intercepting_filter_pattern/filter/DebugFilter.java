package intercepting_filter_pattern.filter;

public class DebugFilter implements Filter{
    public void execute(String request) {
        System.out.println("Debug Filter" + request);
    }
}
