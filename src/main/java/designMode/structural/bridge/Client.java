package designMode.structural.bridge;

import designMode.structural.bridge.abstractType.IPhone;
import designMode.structural.bridge.abstractType.XiaoMi;
import designMode.structural.bridge.impl.impl.NewPhone;
import designMode.structural.bridge.impl.impl.OldPhone;

/**
 * @author YJ Lan
 * @create 2020-05-18-22:38
 */
public class Client {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.setPhone(new OldPhone());
        iPhone.use();

        XiaoMi xiaoMi = new XiaoMi();
        xiaoMi.setPhone(new NewPhone());
        xiaoMi.use();

    }
}
