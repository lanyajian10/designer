package designMode.create.builder.builder;

import lombok.Setter;

/**
 * @author YJ Lan
 * @create 2020-05-17-22:17
 */
@Setter
public class Engineer {

    private Builder builder;

    public Engineer(Builder builder){
        this.builder = builder;
    }

    /**
     * 以工程师的想法盖房子
     * @return
     */
    public House buildHouse(){
        builder.buildBasic();
        builder.buildWall();
        builder.buildRoof();
        return builder.builder();
    }
}
