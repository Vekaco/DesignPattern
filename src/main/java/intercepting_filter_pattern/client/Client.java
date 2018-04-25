package intercepting_filter_pattern.client;

import intercepting_filter_pattern.filter_manager.FilterManager;

public class Client {

    private FilterManager manager;


    public void setManager(FilterManager manager) {
        this.manager = manager;
    }

    public void sendRequest(String request) {
        manager.filterRequest(request);
    }
}
