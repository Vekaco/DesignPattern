package singleton_pattern.objects;

/**
 * 懒汉式
 * 线程安全
 * 静态内部类
 */
public class SingleObject5 {
    private SingleObject5(){}

    private static class SingleObject5Holder{
        private static final SingleObject5 INSTANCE = new SingleObject5();
    }

    public static final SingleObject5 getInstance(){
        return SingleObject5Holder.INSTANCE;
    }

}
