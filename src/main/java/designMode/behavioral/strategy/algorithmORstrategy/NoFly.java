package designMode.behavioral.strategy.algorithmORstrategy;

/**
 * @author YJ Lan
 * @create 2020-05-26-22:31
 */
public class NoFly implements Strategy {
    @Override
    public void fly() {
        System.out.println("不会飞....");
    }
}
