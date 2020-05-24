package designMode.behavioral.visitor.beVisitor;

import designMode.behavioral.visitor.visitor.Visitor;

import java.util.Random;

/**
 * @author YJ Lan
 * @create 2020-05-24-11:26
 */
public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProductNum(){
        return new Random().nextInt(20);
    }
}
