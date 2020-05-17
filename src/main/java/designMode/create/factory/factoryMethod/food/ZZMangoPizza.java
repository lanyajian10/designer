package designMode.create.factory.factoryMethod.food;

import designMode.create.factory.Base.Pizza;

/**
 * @author YJ Lan
 * @create 2020-05-17-20:10
 */
public class ZZMangoPizza extends Pizza {
    @Override
    public void prepare() {
        this.name = "郑州芒果披萨";
    }
}
