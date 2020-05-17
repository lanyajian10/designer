package designMode.create.builder.builder;

/**
 * @author YJ Lan
 * @create 2020-05-17-22:20
 */
public class Demo {

    public static void main(String[] args) {
        House house = new House();
        CommonBuilder commonHouse = new CommonBuilder(house);
        Engineer engineer = new Engineer(commonHouse);
        engineer.buildHouse();
    }
}
