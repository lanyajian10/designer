package designMode.behavioral.visitor.beVisitor;

import designMode.behavioral.visitor.visitor.Visitor;
import lombok.Getter;

import java.util.Random;

/**
 * @author YJ Lan
 * @create 2020-05-24-11:20
 */
@Getter
public abstract class Staff {

    private String name ;
    private Integer KPI;

    public Staff(String name){
        this.name = name;
        KPI = new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);

}
