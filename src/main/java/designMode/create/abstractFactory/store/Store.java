package designMode.create.abstractFactory.store;


import designMode.create.abstractFactory.factory.BJOrderFactory;
import designMode.create.abstractFactory.order.OrderPizza;

/**
 * @author YJ Lan
 * @create 2020-05-17-19:44
 */
public class Store {
    public static void main(String[] args) {

        new OrderPizza(new BJOrderFactory());

    }
}
