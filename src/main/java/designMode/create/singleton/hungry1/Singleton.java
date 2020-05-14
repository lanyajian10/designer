package designMode.create.singleton.hungry1;

/**
 * 单例模式之 饿汉模式
 * @author YJ Lan
 * @create 2020-05-14-21:41
 */
/**
 * 饿汉式（静态常量）
 * 1. 装载时实例化，避免线程问题
 * 2. 可能未用到，内存浪费（不能懒加载）
 */
public class Singleton {
    private Singleton(){};
    private final static Singleton instance = new Singleton();
    public static Singleton getInstance() {return instance;}
}


