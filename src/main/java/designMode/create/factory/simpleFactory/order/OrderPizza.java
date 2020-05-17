package designMode.create.factory.simpleFactory.order;

import designMode.create.factory.common.Utils;
import designMode.create.factory.Base.Pizza;
import designMode.create.factory.simpleFactory.factory.OrderFactory;

/**
 * 工厂方法前：不符合ocp原则，如果有很多种订单，每增加一种Pizza种类，需要修改很多代码
 * 工厂方法后：符合ocp，即便有很多种披萨订单，我们只需要修改一个工厂类
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
