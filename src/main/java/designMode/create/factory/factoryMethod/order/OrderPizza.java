package designMode.create.factory.factoryMethod.order;

import designMode.create.factory.Base.Pizza;
import designMode.create.factory.common.Utils;
import designMode.create.factory.simpleFactory.factory.OrderFactory;

/**
 * @author YJ Lan
 * @create 2020-05-17-19:40
 */
public abstract class OrderPizza  {

    public OrderPizza(){
        Pizza pizza = create(Utils.getPizzaType());
        System.out.println("类型结束....");
        if (null != pizza) {
            pizza.prepare();
            pizza.make();
            pizza.cut();
        } else {
            System.out.println("没有您想买的披萨类型.....");
        }
    }

    public abstract Pizza create(String orderType);
}
