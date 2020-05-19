package designMode.structural.decorator;

/**
 * @author YJ Lan
 * @create 2020-05-19-22:22
 */
public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setMessage(" 牛奶 ");
        setPrice(2.0f);
    }
}
