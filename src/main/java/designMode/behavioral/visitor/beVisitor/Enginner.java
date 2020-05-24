package designMode.behavioral.visitor.beVisitor;

import designMode.behavioral.visitor.visitor.Visitor;

import java.util.Random;

/**
 * @author YJ Lan
 * @create 2020-05-24-11:23
 */
public class Enginner extends Staff {

    public Enginner(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getCodeLines(){
        return new Random().nextInt(200000);
    }
}
