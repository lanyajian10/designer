package designMode.structural.bridge.impl.impl;

import designMode.structural.bridge.impl.Phone;

/**
 * @author YJ Lan
 * @create 2020-05-18-22:30
 */
public class NewPhone implements Phone {
    public void open(String name) {
        System.out.println(name + "新式手机打开");
    }

    public void close(String name) {
        System.out.println(name + "新式手机关闭");
    }

    public void call(String name) {
        System.out.println(name + "新式手机打电话");
    }
}
