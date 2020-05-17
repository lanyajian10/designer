package designMode.create.factory.factoryMethod.food;

import designMode.create.factory.Base.Pizza;

/**
 * @author YJ Lan
 * @create 2020-05-17-20:06
 */
public class BJMangoPizza extends Pizza {
    @Override
    public void prepare() {
        this.name = "北京芒果披萨";
    }
}
