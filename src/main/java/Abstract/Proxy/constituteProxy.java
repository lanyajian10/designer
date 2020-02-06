/**
 * 动态代理的组成
 * 标的接口     Subject1，Subject2
 * 标的类      RealSubject1
 * 拦截类      intercept
 * 耦合类      Invocation
 * 测试类      constituteProxy
 */
package Abstract.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface Subject1
{
    void do1();
}

interface Subject2
{
    String do2(String meg);
}

class RealSubject1 implements Subject1,Subject2
{
    @Override
    public String do2(String meg) {
        System.out.println("发来的信息是: "+meg);
        return null;
    }
    @Override
    public void do1() {
        System.out.println("自创信息");
    }

}

class intercept
{
    public void preDo()
    {
        System.out.println("执行前......");
    }
    public void postDo()
    {
        System.out.println("执行后......");
    }
}

class Invocation implements InvocationHandler
{
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        intercept intercept = new intercept();
        RealSubject1 realSubject1 = new RealSubject1();

        if (args!=null&&args.length==1)
        args[0] = "param is changed !";
        intercept.preDo();

        method.invoke(realSubject1,args);

        intercept.postDo();
        return null;
    }
}

public class constituteProxy
{
    public static void main(String[] args)
    {
        logic1();
//        logic2();
    }

    public static void logic1()
    {
        Invocation invocation = new Invocation();

        Object o = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Subject1.class, Subject2.class}, invocation);
        publicLogic(o);
    }

    public static void logic2()
    {
        Invocation invocation = new Invocation();
        Object o = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Subject1.class}, invocation);
        publicLogic(o);
    }
    private static void publicLogic(Object proxy)
    {
        Subject1  subject1 = (Subject1) proxy;
        subject1.do1();
        Subject2  subject2 = (Subject2) proxy;
        subject2.do2("hello");

    }
}
