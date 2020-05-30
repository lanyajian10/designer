package designMode.structural.decorator.bePack;

import lombok.Data;

/**
 * @author YJ Lan
 * @create 2020-05-19-22:12
 */
@Data
public abstract class Drink {

    private float price;
    private String message;
    public abstract float cost();
}
