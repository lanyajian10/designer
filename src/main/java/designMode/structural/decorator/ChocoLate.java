package designMode.structural.decorator;

/**
 * @author YJ Lan
 * @create 2020-05-19-22:21
 */
public class ChocoLate extends Decorator {
    public ChocoLate(Drink drink) {
        super(drink);
        setMessage(" 巧克力 ");
        setPrice(4.0f);
    }
}
