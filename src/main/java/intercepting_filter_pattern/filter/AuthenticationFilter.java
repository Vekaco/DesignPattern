package intercepting_filter_pattern.filter;

public class AuthenticationFilter implements Filter{
    public void execute(String request) {
        System.out.println("Authentication Filter" + request);
    }
}
