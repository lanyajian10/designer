package designMode.create.factory.factoryMethod.factory;

import designMode.create.factory.Base.Pizza;
import designMode.create.factory.factoryMethod.food.BJDurianPizza;
import designMode.create.factory.factoryMethod.food.BJMangoPizza;
import designMode.create.factory.factoryMethod.order.OrderPizza;

/**
 * @author YJ Lan
 * @create 2020-05-17-19:55
 */
public class BJOrderFactory extends OrderPizza {


    public  Pizza create(String orderType){
        Pizza pizza = null;

        switch (orderType) {
            case "Mango":
                pizza = new BJMangoPizza();
                break;
            case "Durian":
                pizza = new BJDurianPizza();
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
