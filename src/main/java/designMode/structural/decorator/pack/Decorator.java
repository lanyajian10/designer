package designMode.structural.decorator.pack;

import designMode.structural.decorator.bePack.Drink;

/**
 * @author YJ Lan
 * @create 2020-05-19-22:19
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }
    @Override
    public float cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getMessage() {
        return super.getMessage() + "" + super.getPrice() + "" + drink.getMessage();
    }
}
