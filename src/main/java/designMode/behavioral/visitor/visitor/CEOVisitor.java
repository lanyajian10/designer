package designMode.behavioral.visitor.visitor;

import designMode.behavioral.visitor.beVisitor.Enginner;
import designMode.behavioral.visitor.beVisitor.Manager;

/**
 * @author YJ Lan
 * @create 2020-05-24-11:28
 */
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Enginner enginner) {
        System.out.println("工程师:"+enginner.getName() +
                " KPI："+enginner.getKPI() );
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("工程师:"+manager.getName() +
                        " KPI："+manager.getKPI() +
                " 产品数: " + manager.getProductNum());
    }
}
