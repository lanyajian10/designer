package designMode.create.builder.builder;

/**
 * @author YJ Lan
 * @create 2020-05-17-22:14
 */
public interface Builder {
    void buildBasic();
    void buildWall();
    void buildRoof();
    House builder();
}
