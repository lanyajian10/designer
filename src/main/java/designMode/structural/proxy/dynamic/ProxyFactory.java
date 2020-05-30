package designMode.structural.proxy.dynamic;

import designMode.structural.proxy.common.ITeachDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author YJ Lan
 * @create 2020-05-20-23:15
 */
public class ProxyFactory {

    ITeachDao iTeachDao;

    public ProxyFactory(ITeachDao teachDao) {
        this.iTeachDao = teachDao;
    }

    public Object getProxyInstances(){
        return Proxy.newProxyInstance(
                iTeachDao.getClass().getClassLoader(),
                iTeachDao.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("执行前...");
                        Object invoke = method.invoke(iTeachDao, args);
                        System.out.println("执行后...");
                        return invoke;
                    }
                });
    }
}
