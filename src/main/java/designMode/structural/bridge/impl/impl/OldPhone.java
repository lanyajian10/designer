package designMode.structural.bridge.impl.impl;

import designMode.structural.bridge.impl.Phone;

/**
 * @author YJ Lan
 * @create 2020-05-18-22:28
 */
public class OldPhone implements Phone {
    public void open(String name) {
        System.out.println(name + "老式手机打开了");
    }

    public void close(String name) {
        System.out.println(name +"老式手机关闭了");
    }

    public void call(String name) {
        System.out.println(name + "老式手机打电话");
    }
}
