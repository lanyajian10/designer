package designMode.create.singleton.lazy6;

/**
 * 懒汉式（静态内部类）
 * 推荐使用---JVM保证线程安全，效率高，懒加载
 *
 * @author YJ Lan
 * @create 2020-05-14-22:07
 */
public class Singleton {
    private Singleton(){}
    private static class SingletonInstance {
        private static final Singleton INSTANCE= new Singleton();
    }
    public Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
