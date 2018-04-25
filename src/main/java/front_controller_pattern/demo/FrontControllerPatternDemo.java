package front_controller_pattern.demo;

import front_controller_pattern.front_controller.FrontController;

public class FrontControllerPatternDemo {
    public static void main(String[] args) {
        FrontController controller = new FrontController();
        controller.dispatchRequest("HOMEVIEW");
    }
}
