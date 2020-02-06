/**
 * 懒汉模式
 */
package Abstract.Singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Lazy
{
    private static Lazy instance = null;
    private Lazy()
    {
        //做一些防止反射暴力创建
        if ( instance != null )
            throw new RuntimeException("单例禁止");
    }

    public static Lazy getInstance()
    {
        if ( instance == null )
        return init();
        else
        return instance;
    }

    private synchronized static Lazy init()
    {
        if ( instance == null )
        return instance = new Lazy();
        else
        return instance;
    }
}

/**
 * 线程安全，效率高，并且实现延迟加载
 */
class lazy implements Serializable
{
    private static class SingletonCalssInstance
    {
        private static final lazy instance = new lazy();
    }
    private lazy()
    {
        //做一些防止反射暴力创建
        if ( SingletonCalssInstance.instance != null )
            throw new RuntimeException("单例禁止");
    }
    public static lazy getInstance()
    {
        return SingletonCalssInstance.instance;
    }

    //防止反序列化获取多个对象
    private Object readResolve() throws ObjectStreamException
    {
        return SingletonCalssInstance.instance;
    }

}