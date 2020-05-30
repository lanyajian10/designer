package designMode.structural.proxy.common;

/**
 * @author YJ Lan
 * @create 2020-05-20-23:16
 */
public class TeachDao implements ITeachDao {
    @Override
    public void teach() {
        System.out.println("教学开始.....");
    }

    @Override
    public void read() {
        System.out.println("读书开始.....");
    }

}
