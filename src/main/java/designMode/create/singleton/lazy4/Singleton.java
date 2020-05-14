package designMode.create.singleton.lazy4;

/**
 * 懒汉式（同步方法）
 * 1.线程安全
 * 2.效率低下
 * 结论：不建议使用
 * @author YJ Lan
 * @create 2020-05-14-22:00
 */
public class Singleton {
    private Singleton(){};
    private static Singleton instance;
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
