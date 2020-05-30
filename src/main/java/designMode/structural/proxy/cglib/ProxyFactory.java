package designMode.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author YJ Lan
 * @create 2020-05-20-23:24
 */
public class ProxyFactory implements MethodInterceptor {
    ITeachDao iTeachDao;

    public ProxyFactory(ITeachDao teachDao) {
        this.iTeachDao = teachDao;
    }

    public Object getProxyInstances(){
        //创建一个cglib工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(iTeachDao.getClass());
        //设置回调
        enhancer.setCallback(this);
        //创建子类
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行前....");
        Object invoke = method.invoke(iTeachDao, args);
        System.out.println("执行后....");
        return invoke;
    }
}
