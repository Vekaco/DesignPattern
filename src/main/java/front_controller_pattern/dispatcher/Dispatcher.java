package front_controller_pattern.dispatcher;

import front_controller_pattern.view.HomeView;
import front_controller_pattern.view.StudentView;

public class Dispatcher {
    private HomeView homeView;
    private StudentView studentView;

    public Dispatcher() {
        homeView = new HomeView();
        studentView = new StudentView();
    }

    public void dispatch(String request) {
        if("HOMEVIEW".equalsIgnoreCase(request)) {
            homeView.show();
        } else {
            studentView.show();
        }
    }

}
