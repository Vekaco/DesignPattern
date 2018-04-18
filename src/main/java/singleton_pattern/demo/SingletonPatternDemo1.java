package singleton_pattern.demo;

import singleton_pattern.objects.SingleObject1;

public class SingletonPatternDemo1 {
    public static void main(String[] args) {
        SingleObject1 singleObject1 = SingleObject1.getInstance();
        singleObject1.whateverMethod();
    }
}
