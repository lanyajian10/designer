package designMode.behavioral.visitor;

import designMode.behavioral.visitor.beVisitor.Enginner;
import designMode.behavioral.visitor.beVisitor.Manager;
import designMode.behavioral.visitor.visitor.CEOVisitor;
import designMode.behavioral.visitor.visitor.CTOVisitor;

/**
 * @author YJ Lan
 * @create 2020-05-24-11:41
 */
public class Client {

    public static void main(String[] args) {
        BussinessReport bussinessReport = new BussinessReport();
        bussinessReport.attach(new Enginner("工程师-A"));
        bussinessReport.attach(new Enginner("工程师-B"));
        bussinessReport.attach(new Manager("经理-1"));
        bussinessReport.attach(new Manager("经理-2"));
        bussinessReport.attach(new Enginner("工程师-C"));

        System.out.println("=============CEO看报表=============");
        bussinessReport.display(new CEOVisitor());
        System.out.println("=============CTO看报表==============");
        bussinessReport.display(new CTOVisitor());
    }
}
