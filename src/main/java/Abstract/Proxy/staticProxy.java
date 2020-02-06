/**
 * 静态代理
 * 抽象类              ：Subject
 * 具体抽象角色（局长）   ：RealSubject
 * 代理角色(秘书)        ：ProxySubject
 * 你：                :staticProxy
 * 秘书-局长（关系）     :Subject
 */
package Abstract.Proxy;

interface Subject
{
    void request();
}
class RealSubject implements Subject
{

    @Override
    public void request() {
        System.out.println("局长：给你办了。。。。");
    }
}
class ProxySubject implements Subject
{
    private RealSubject real;
    public ProxySubject(RealSubject realSubject)
    {
        this.real = realSubject;
    }
    @Override
    public void request()
    {
        preRequest();
        if ( real == null )
        real = new RealSubject();
        real.request();
        postRequest();
    }
    public void preRequest()
    {
        System.out.println("我去找局长.....");
    }
    public void postRequest()
    {
        System.out.println("好了。。。。");
    }
}
public class staticProxy
{
    public static void main(String[] args)
    {
        RealSubject realSubject = new RealSubject();
        ProxySubject proxySubject = new ProxySubject(realSubject);
        proxySubject.request();
    }
}
