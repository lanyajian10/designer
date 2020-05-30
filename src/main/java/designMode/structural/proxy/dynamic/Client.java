package designMode.structural.proxy.dynamic;

import designMode.structural.proxy.common.ITeachDao;
import designMode.structural.proxy.common.TeachDao;

/**
 * 动态代理
 * @author YJ Lan
 * @create 2020-05-20-23:22
 */
public class Client {
    public static void main(String[] args) {
        TeachDao teachDao = new TeachDao();
        ProxyFactory proxyFactory = new ProxyFactory(teachDao);
        ITeachDao instances = (ITeachDao)proxyFactory.getProxyInstances();
        instances.teach();
        instances.read();
    }
}
