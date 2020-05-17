package designMode.create.abstractFactory.factory;

import designMode.create.abstractFactory.Base.Factory;
import designMode.create.abstractFactory.Base.Pizza;
import designMode.create.abstractFactory.food.BJDurianPizza;
import designMode.create.abstractFactory.food.BJMangoPizza;

/**
 * @author YJ Lan
 * @create 2020-05-17-19:55
 */
public class BJOrderFactory implements Factory {

    public Pizza create(String orderType){
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
