package designMode.behavioral.visitor.visitor;

import designMode.behavioral.visitor.beVisitor.Enginner;
import designMode.behavioral.visitor.beVisitor.Manager;

/**
 * @author YJ Lan
 * @create 2020-05-24-11:28
 */
public class CTOVisitor implements Visitor {
    @Override
    public void visit(Enginner enginner) {
        System.out.println("工程师:"+enginner.getName() +
                " 代码行数: " + enginner.getCodeLines());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("工程师:"+manager.getName() +
                " 代码行数: " + manager.getProductNum());
    }
}
