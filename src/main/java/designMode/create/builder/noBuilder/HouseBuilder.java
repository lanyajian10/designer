package designMode.create.builder.noBuilder;

/**
 * @author YJ Lan
 * @create 2020-05-17-22:05
 */
public abstract class HouseBuilder {

    abstract void buildBasic();
    abstract void buildWall();
    abstract void buildRoof();

    public void build(){
        buildBasic();
        buildWall();
        buildRoof();
        System.out.println("完成....");
    }
}
