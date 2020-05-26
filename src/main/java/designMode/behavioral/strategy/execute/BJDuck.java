package designMode.behavioral.strategy.execute;

import designMode.behavioral.strategy.algorithmORstrategy.NoFly;

/**
 * 北京鸭子不会飞
 * @author YJ Lan
 * @create 2020-05-26-22:30
 */
public class BJDuck extends Duck {

    public BJDuck(){
        setStrategy(new NoFly());
    }
    @Override
    public void display() {
        getStrategy().fly();
    }
}
