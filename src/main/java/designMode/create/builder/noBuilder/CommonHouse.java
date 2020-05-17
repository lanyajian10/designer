package designMode.create.builder.noBuilder;

/**
 * @author YJ Lan
 * @create 2020-05-17-22:07
 */
public class CommonHouse extends HouseBuilder {
    @Override
    void buildBasic() {
        System.out.println("大众地基");
    }

    @Override
    void buildWall() {
        System.out.println("大众墙体");
    }

    @Override
    void buildRoof() {
        System.out.println("大众屋顶");
    }
}
