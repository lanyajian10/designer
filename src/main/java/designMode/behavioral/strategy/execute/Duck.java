package designMode.behavioral.strategy.execute;

import designMode.behavioral.strategy.algorithmORstrategy.Strategy;
import lombok.Data;

/**
 * @author YJ Lan
 * @create 2020-05-26-21:48
 */
@Data
public abstract class Duck {

    private Strategy strategy;

    public abstract void display();
}
