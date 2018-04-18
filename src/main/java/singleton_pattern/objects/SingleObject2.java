package singleton_pattern.objects;

/**
 * 懒汉式
 * 非线程安全
 */
public class SingleObject2 {
    private SingleObject2(){}
    private static SingleObject2 instance;

    public static SingleObject2 getInstance(){
        if(instance == null){
            instance = new SingleObject2();
        }
        return instance;
    }
    public void whateverMethod(){

    }

}
