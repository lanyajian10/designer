package designMode.create.abstractFactory.factory;


import designMode.create.abstractFactory.Base.Factory;
import designMode.create.abstractFactory.Base.Pizza;
import designMode.create.abstractFactory.food.ZZDurianPizza;
import designMode.create.abstractFactory.food.ZZMangoPizza;

/**
 * 把  制作披萨类型抽出来做个静态简单工厂，
 * @author YJ Lan
 * @create 2020-05-17-19:55
 */
public class ZZOrderFactory implements Factory {

    public Pizza create(String orderType){
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
