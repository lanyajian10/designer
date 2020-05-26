package designMode.behavioral.strategy.execute;

import designMode.behavioral.strategy.algorithmORstrategy.GoodOfFly;

/**
 * @author YJ Lan
 * @create 2020-05-26-22:33
 */
public class WildDuck extends Duck {

    public WildDuck(){
        setStrategy(new GoodOfFly());
    }

    @Override
    public void display() {
        getStrategy().fly();
    }
}
