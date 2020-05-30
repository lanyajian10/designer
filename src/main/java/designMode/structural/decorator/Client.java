package designMode.structural.decorator;

import designMode.structural.decorator.bePack.Drink;
import designMode.structural.decorator.bePack.LongBlack;
import designMode.structural.decorator.pack.ChocoLate;
import designMode.structural.decorator.pack.Milk;

/**
 * @author YJ Lan
 * @create 2020-05-19-22:25
 */
public class Client {
    public static void main(String[] args) {
        Drink coffee = new LongBlack();
        System.out.println("信息：" + coffee.getMessage());
        System.out.println("价格：" + coffee.cost());

        coffee = new Milk(coffee);
        System.out.println("信息：" + coffee.getMessage());
        System.out.println("价格：" + coffee.cost());

        coffee = new ChocoLate(coffee);
        System.out.println("信息：" + coffee.getMessage());
        System.out.println("价格：" + coffee.cost());

        coffee = new Milk(coffee);
        System.out.println("信息：" + coffee.getMessage());
        System.out.println("价格：" + coffee.cost());
    }
}
