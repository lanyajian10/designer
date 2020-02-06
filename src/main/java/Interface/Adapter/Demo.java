package Interface.Adapter;

/**
 * 适配器模式
 * 例如： 220V和110V不兼容
 * 在不能改动代码的情况下 让110V可以调用220V
 */
public class Demo {
    public static void main(String[] args) {
        _adapterB adapterB = new _adapterB();
        adapterB._110V();

        _adapter adapter = new _adapter();
        adapter._110V();

    }



}
