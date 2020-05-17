package designMode.create.builder.builder;

import lombok.Setter;

/**
 * 根据房子类型不同，房子每个步骤的建造方式
 * @author YJ Lan
 * @create 2020-05-17-22:15
 */
@Setter
public class CommonBuilder implements Builder {

    private House house;

    public CommonBuilder(House house){
        this.house = house;
    }

    public void buildBasic() {
        house.setBasic(5);
    }

    public void buildWall() {
        house.setWall(10);
    }

    public void buildRoof() {
        house.setRoof(1);
    }

    public House builder() {
        System.out.println( house.toString());
        return house;
    }
}
