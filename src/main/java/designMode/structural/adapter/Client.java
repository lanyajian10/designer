package designMode.structural.adapter;


import designMode.structural.adapter.ClassAdapter.ClassAdapter;
import designMode.structural.adapter.ObjectAdapter.ObjectAdapter;
import designMode.structural.adapter.service.Impl._220VImpl;

/**
 * @author YJ Lan
 * @create 2020-05-17-22:42
 */
public class Client {
    public static void main(String[] args) {
        //类适配器  110V 适配成 220V
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter._220();
        //对象适配器 将 220V适配成 110V
        ObjectAdapter objectAdapter = new ObjectAdapter();
        objectAdapter.setV1(new _220VImpl());
        objectAdapter._110V();


    }
}
