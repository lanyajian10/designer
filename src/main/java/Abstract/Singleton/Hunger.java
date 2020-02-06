/**
 * 饿汉模式
 */
package Abstract.Singleton;

public class Hunger
{
    private static Hunger instance = new Hunger();
    private Hunger()
    {

    }
    public static Hunger getInstance()
    {
        return instance;
    }
}
