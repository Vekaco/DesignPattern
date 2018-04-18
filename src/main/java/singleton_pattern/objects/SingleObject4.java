package singleton_pattern.objects;

/**
 * 懒汉式
 * 线程安全
 * DCL 双重校验锁
 */
public class SingleObject4 {

    private SingleObject4(){}

    private static volatile SingleObject4 instance;

    public static SingleObject4 getInstance(){
        if(instance == null){
            synchronized (SingleObject4.class){
                if(instance == null) {
                    instance = new SingleObject4();
                }
            }
        }
        return instance;
    }
}
