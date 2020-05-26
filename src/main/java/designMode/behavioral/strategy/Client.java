package designMode.behavioral.strategy;

import designMode.behavioral.strategy.algorithmORstrategy.NoFly;
import designMode.behavioral.strategy.execute.BJDuck;
import designMode.behavioral.strategy.execute.Duck;
import designMode.behavioral.strategy.execute.WildDuck;

/**
 * @author YJ Lan
 * @create 2020-05-26-22:33
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("北京鸭子....");
        Duck bjDuck = new BJDuck();
        bjDuck.display();

        System.out.println("野鸭子....");
        Duck wildDuck = new WildDuck();
        wildDuck.display();

        System.out.println("野鸭子成家养的了....");
        wildDuck.setStrategy(new NoFly());
        wildDuck.display();
    }
}
