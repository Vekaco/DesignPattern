package singleton_pattern.objects;

/**
 * 饿汉式
 * 线程安全
 */
public class SingleObject1 {

    private SingleObject1(){}

    private static SingleObject1 singleObject1 = new SingleObject1();

    public static SingleObject1 getInstance() {
        return singleObject1;
    }

    public void whateverMethod(){
        System.out.println("whatever...");
    }

}
