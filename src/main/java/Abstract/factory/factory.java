/**
 * 工厂方法模式
 * 如果增加P3  则直接再加一个InProductFactory的实现：  P3工厂    满足 OCP模式（开闭模式---扩展不需要修改已有代码）
 */
package Abstract.factory;
interface InProductFactory
{
    Product getProduct();
}
class InProductAFactory implements InProductFactory
{

    @Override
    public Product getProduct()
    {
        return new ProductA();
    }
}
class InProductBFactory implements InProductFactory
{
    @Override
    public Product getProduct()
    {
        return new ProductB();
    }
}
public class factory {


    public static void main(String[] args)
    {
        InProductAFactory factory = new InProductAFactory();
        InProductBFactory factoryB = new InProductBFactory();
        Product p1 = factory.getProduct();
        Product p2 = factoryB.getProduct();

        p1.doSome();
        p2.doSome();
    }
}
