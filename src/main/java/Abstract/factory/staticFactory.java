/**
 * 简单工厂模式
 * 如果增加产品C，则需要修改静态工厂类  增加生产新产品C的方法
 *
 */

package Abstract.factory;

/**
 * 抽象工厂角色
 * 具体工程角色
 * 抽象产品角色
 * 具体产品角色
 */
interface Product
{
    void doSome();
}
class ProductA implements Product
{
    public void doSome()
    {
        System.out.println("产品A");
    }
}
class ProductB implements Product
{
    public void doSome()
    {
        System.out.println("产品B");
    }
}

class ProductFactory
{

    public static Product getProductA()
    {
        return new ProductA();
    }

    public static Product getProductB()
    {
        return new ProductB();
    }
}
public class staticFactory
{
    public static void main(String[] args)
    {
        Product p1 = ProductFactory.getProductA();
        Product p2 = ProductFactory.getProductB();
        p1.doSome();
        p2.doSome();
    }
}
