package designMode.create.builder.noBuilder;

/**
 * 耦合性太高，建造者、被建造者，建造方式分离进行解耦
 * @author YJ Lan
 * @create 2020-05-17-22:09
 */
public class Engineer {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
