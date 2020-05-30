package designMode.create.factory.simpleFactory.order;

import designMode.create.factory.common.Utils;
import designMode.create.factory.Base.Pizza;
import designMode.create.factory.simpleFactory.factory.OrderFactory;

/**
 * 工厂方法前：我们需要自己去new创建对象
 * 工厂方法后：封装至工厂中去，不需要知道创建细节。（DP）
 * @author YJ Lan
 * @create 2020-05-17-19:40
 */
public class OrderPizza {

    public OrderPizza(){
        Pizza pizza = OrderFactory.create(Utils.getPizzaType());
        if (null != pizza) {
            pizza.prepare();
            pizza.make();
            pizza.cut();
        } else {
            System.out.println("没有您想买的披萨类型.....");
        }
    }
}
