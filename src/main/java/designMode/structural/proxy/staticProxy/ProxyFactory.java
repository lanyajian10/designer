package designMode.structural.proxy.staticProxy;

import designMode.structural.proxy.common.ITeachDao;

/**
 * @author YJ Lan
 * @create 2020-05-20-23:15
 */
public class ProxyFactory implements ITeachDao {

    ITeachDao iTeachDao;

    public ProxyFactory(ITeachDao teachDao) {
        this.iTeachDao = teachDao;
    }

    @Override
    public void teach() {
        System.out.println("执行前....");
        iTeachDao.teach();
        System.out.println("执行后....");
    }

    @Override
    public void read() {

    }
}
