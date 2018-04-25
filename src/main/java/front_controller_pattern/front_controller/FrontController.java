package front_controller_pattern.front_controller;

import front_controller_pattern.dispatcher.Dispatcher;

public class FrontController {

    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher =  new Dispatcher();
    }

    public boolean isAuthenticUser(){
        return true;
    }

    public void trackRequest(String request){
        System.out.println("tracking " + request);
    }

    public void dispatchRequest(String request) {

        trackRequest(request);
        if(isAuthenticUser()) {
            dispatcher.dispatch(request);
        }
    }




}
