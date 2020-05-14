package designMode.create.singleton.lazy5;

/**
 * 懒汉式（Double check）
 * 1. 懒加载，线程安全，效率问题
 * @author YJ Lan
 * @create 2020-05-14-22:03
 */
public class Singleton {
    private Singleton(){};
    private static volatile Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
