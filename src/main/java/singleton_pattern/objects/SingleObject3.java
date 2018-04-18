package singleton_pattern.objects;

/**
 * 懒汉式
 * 线程安全
 */
public class SingleObject3 {
    private SingleObject3(){}

    private static SingleObject3 instance;

    public static synchronized SingleObject3 getInstance(){
        if(instance == null) {
            instance = new SingleObject3();
        }
        return instance;
    }
}
