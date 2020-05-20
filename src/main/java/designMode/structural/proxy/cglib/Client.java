package designMode.structural.proxy.cglib;

/**
 * @author YJ Lan
 * @create 2020-05-20-23:30
 */
public class Client {
    public static void main(String[] args) {

        ITeachDao iTeachDao = new ITeachDao();
        ProxyFactory proxyFactory = new ProxyFactory(iTeachDao);
        ITeachDao proxyInstances = (ITeachDao)proxyFactory.getProxyInstances();
        proxyInstances.teach();
    }
}
