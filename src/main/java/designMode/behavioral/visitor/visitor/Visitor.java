package designMode.behavioral.visitor.visitor;

import designMode.behavioral.visitor.beVisitor.Enginner;
import designMode.behavioral.visitor.beVisitor.Manager;

/**
 * @author YJ Lan
 * @create 2020-05-24-11:20
 */
public interface Visitor {

    void visit(Enginner enginner);

    void visit(Manager manager);
}
