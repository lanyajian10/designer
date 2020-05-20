package designMode.structural.proxy.staticProxy;

import designMode.structural.proxy.common.TeachDao;

/**
 * 静态代理
 * @author YJ Lan
 * @create 2020-05-20-23:18
 */
public class Client {
    public static void main(String[] args) {
        TeachDao teachDao = new TeachDao();
        ProxyFactory proxyFactory = new ProxyFactory(teachDao);
        proxyFactory.teach();
    }
}
