/**
 * 标的接口     Subject1，Subject2
 * 标的类      RealSubject1
 * 拦截类      intercept
 * 耦合类      Invocation1
 * 测试类      dynamicProxy
 */
package Abstract.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


class RealSubject11 implements Subject1
{

    public void do1() {
        System.out.println("自创信息");
    }

}

class Invocation1 implements InvocationHandler
{
    private intercept in ;
    private RealSubject11 real;
    public Invocation1(RealSubject11 realSubject1 , intercept ins)
    {
        this.real = realSubject1;
        this.in = ins;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {
        //添加的  执行前处理
        in.preDo();
        //方法本身的执行逻辑
        method.invoke(real,args);
        //添加的  执行后处理  ------类似spring的AOP   struts的拦截器
        in.postDo();
        return null;
    }
}


public class dynamicProxy {
    public static void main(String[] args) throws Throwable{
        RealSubject11 realSubject1 = new RealSubject11();
        intercept intercept = new intercept();
        InvocationHandler handler = new Invocation1(realSubject1,intercept);
        Class<? extends RealSubject11> aClass = realSubject1.getClass();
        /**
         *
         * Class<?> proxyClass = Proxy.getProxyClass(aClass.getClassLoader(), aClass.getInterfaces());
         * Constructor<?> ct = proxyClass.getConstructor(new Class[]{InvocationHandler.class});
         * Subject1 o = (Subject1)ct.newInstance(new Object[]{handler});
         */
//        Subject1 o = (Subject1)Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), handler);

        Subject1 o =  (Subject1)Proxy.newProxyInstance(
                //获取类加载器
                Subject1.class.getClassLoader(),
                //获取 接口集合
                new Class[]{Subject1.class},
                //获取 继承InvocationHandler的  代理对象，传入构造方法需要的参数
                new Invocation1(new RealSubject11(),intercept)
        );
        o.do1();

    }
}
