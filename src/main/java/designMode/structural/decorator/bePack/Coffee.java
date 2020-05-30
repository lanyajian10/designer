package designMode.structural.decorator.bePack;

/**
 * @author YJ Lan
 * @create 2020-05-19-22:14
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
