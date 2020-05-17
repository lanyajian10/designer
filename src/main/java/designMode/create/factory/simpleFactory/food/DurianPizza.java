package designMode.create.factory.simpleFactory.food;

import designMode.create.factory.Base.Pizza;

/**
 * @author YJ Lan
 * @create 2020-05-17-19:34
 */
public class DurianPizza extends Pizza {


    @Override
    public void prepare() {
        this.name = "榴莲披萨";
    }
}
