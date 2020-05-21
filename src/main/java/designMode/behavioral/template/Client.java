package designMode.behavioral.template;


/**
 * @author YJ Lan
 * @create 2020-05-21-22:14
 */
public class Client {
    public static void main(String[] args) {
        Template milk = new Milk();
        milk.run();

        Water water = new Water();
        water.run();
    }
}
