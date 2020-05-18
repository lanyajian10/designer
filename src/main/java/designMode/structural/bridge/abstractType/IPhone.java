package designMode.structural.bridge.abstractType;

/**
 * @author YJ Lan
 * @create 2020-05-18-22:37
 */
public class IPhone extends Brand {
    public void use() {
        name = "苹果";
        phone.open(name);
        phone.call(name);
        phone.close(name);
    }
}
