package designMode.create.factory.simpleFactory.factory;

import designMode.create.factory.noFactory.food.DurianPizza;
import designMode.create.factory.noFactory.food.MangoPizza;
import designMode.create.factory.Base.Pizza;

/**
 * 把  制作披萨类型抽出来做个静态简单工厂，
 * @author YJ Lan
 * @create 2020-05-17-19:55
 */
public class OrderFactory {

    public static Pizza create(String orderType){
        Pizza pizza = null;

        switch (orderType) {
            case "Mango":
                pizza = new MangoPizza();
                break;
            case "Durian":
                pizza = new DurianPizza();
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
