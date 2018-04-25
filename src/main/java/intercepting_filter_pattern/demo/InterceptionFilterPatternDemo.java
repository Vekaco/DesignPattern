package intercepting_filter_pattern.demo;

import intercepting_filter_pattern.client.Client;
import intercepting_filter_pattern.filter.AuthenticationFilter;
import intercepting_filter_pattern.filter.DebugFilter;
import intercepting_filter_pattern.filter_manager.FilterManager;
import intercepting_filter_pattern.target.Target;

public class InterceptionFilterPatternDemo {
    public static void main(String[] args) {
        Target target = new Target();
        FilterManager manager = new FilterManager(target);
        manager.setFilter(new AuthenticationFilter());
        manager.setFilter(new DebugFilter());
        Client client = new Client();
        client.setManager(manager);
        client.sendRequest("Hi");
    }
}
