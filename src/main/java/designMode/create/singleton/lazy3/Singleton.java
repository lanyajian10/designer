package designMode.create.singleton.lazy3;

/**
 * 单例模式之 懒汉模式
 * @author YJ Lan
 * @create 2020-05-14-21:41
 */
/**
 * 懒汉式（线程不安全）
 * 1. 懒加载，
 * 2. 线程安全问题
 * 实际开发中  禁止使用
 */
public class Singleton {
    private Singleton(){};
    private static Singleton instance;
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}


