package designMode.create.abstractFactory.order;

import designMode.create.abstractFactory.Base.Pizza;
import designMode.create.abstractFactory.Base.Factory;
import designMode.create.factory.common.Utils;

/**
 * @author YJ Lan
 * @create 2020-05-17-19:40
 */
public  class OrderPizza  {

    public OrderPizza(Factory factory){
        Pizza pizza = factory.create(Utils.getPizzaType());
        System.out.println("类型结束....");
        if (null != pizza) {
            pizza.prepare();
            pizza.make();
            pizza.cut();
        } else {
            System.out.println("没有您想买的披萨类型.....");
        }
    }

}
