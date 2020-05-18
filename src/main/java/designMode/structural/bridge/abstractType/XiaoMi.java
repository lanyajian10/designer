package designMode.structural.bridge.abstractType;

/**
 * @author YJ Lan
 * @create 2020-05-18-22:31
 */
public class XiaoMi extends Brand {

    public void use() {
        name = "小米";
        phone.open(name);
        phone.call(name);
        phone.close(name);
    }
}
