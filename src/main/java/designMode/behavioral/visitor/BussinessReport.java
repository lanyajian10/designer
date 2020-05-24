package designMode.behavioral.visitor;

import designMode.behavioral.visitor.beVisitor.Staff;
import designMode.behavioral.visitor.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 员工报表
 * CEO关心 工程师的 KPI      经理的 KPI 和 产品数
 * CTO关心 工程师的 代码行数  经理的 产品数
 * @author YJ Lan
 * @create 2020-05-24-11:36
 */
public class BussinessReport {

    private List<Staff> mStaffs = new ArrayList<Staff>();

    public void attach(Staff staff){
        mStaffs.add(staff);
    }

    public void retach(Staff staff){
        mStaffs.remove(staff);
    }

    public void display(Visitor visitor){
        for (Staff mStaff : mStaffs) {
            mStaff.accept(visitor);
        }
    }
}
