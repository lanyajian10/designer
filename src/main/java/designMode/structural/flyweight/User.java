package designMode.structural.flyweight;

import lombok.Data;

/**
 * 属于外部状态
 * @author YJ Lan
 * @create 2020-05-20-21:49
 */
@Data
public class User {

    private String name;

    public User(String name){
        this.name = name;
    }


}
