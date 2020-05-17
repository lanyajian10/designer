package designMode.create.factory.noFactory.order;

import designMode.create.factory.common.Utils;
import designMode.create.factory.noFactory.food.DurianPizza;
import designMode.create.factory.noFactory.food.MangoPizza;
import designMode.create.factory.Base.Pizza;

/**
 * 不符合ocp原则，如果有很多种订单，每增加一种Pizza种类，需要修改很多代码
 * @author YJ Lan
 * @create 2020-05-17-19:40
 */
public class OrderPizza {

    public OrderPizza (){
        Pizza pizza = null;

        switch (Utils.getPizzaType()) {
            case "Mango":
                pizza = new MangoPizza();
                break;
            case "Durian":
                pizza = new DurianPizza();
                break;
            default:
                pizza = null;
        }
        if (null != pizza) {
            pizza.prepare();
            pizza.make();
            pizza.cut();
        } else {
            System.out.println("没有您想买的披萨类型.....");
        }
    }
}
