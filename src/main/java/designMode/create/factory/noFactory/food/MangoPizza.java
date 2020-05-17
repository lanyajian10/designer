package designMode.create.factory.noFactory.food;

import designMode.create.factory.Base.Pizza;

/**
 * @author YJ Lan
 * @create 2020-05-17-19:39
 */
public class MangoPizza extends Pizza {
    @Override
    public void prepare() {
        this.name = "芒果披萨";
    }
}
