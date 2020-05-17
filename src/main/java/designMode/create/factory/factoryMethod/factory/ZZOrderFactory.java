package designMode.create.factory.factoryMethod.factory;

import designMode.create.factory.Base.Pizza;
import designMode.create.factory.factoryMethod.food.ZZDurianPizza;
import designMode.create.factory.factoryMethod.food.ZZMangoPizza;
import designMode.create.factory.factoryMethod.order.OrderPizza;

/**
 * 把  制作披萨类型抽出来做个静态简单工厂，
 * @author YJ Lan
 * @create 2020-05-17-19:55
 */
public class ZZOrderFactory extends OrderPizza {

    public  Pizza create(String orderType){
        Pizza pizza = null;

        switch (orderType) {
            case "Mango":
                pizza = new ZZMangoPizza();
                break;
            case "Durian":
                pizza = new ZZDurianPizza();
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
