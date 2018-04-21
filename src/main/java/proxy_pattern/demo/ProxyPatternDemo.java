package proxy_pattern.demo;

import proxy_pattern.proxy_class.ImageProxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ImageProxy proxy = new ImageProxy();

        proxy.display();
        proxy.display();
    }
}
