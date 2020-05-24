package designMode.behavioral.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author YJ Lan
 * @create 2020-05-24-13:37
 */
public class InfoCollege implements College {

    private List<Department> departmentList ;

    public InfoCollege(){
        departmentList = new ArrayList<>();
        departmentList.add(new Department("信息1"));
        departmentList.add(new Department("信息2"));
        departmentList.add(new Department("信息3"));
        departmentList.add(new Department("信息4"));

    }

    @Override
    public Iterator getIterator() {
        return new Itr();
    }

    @Override
    public String name() {
        return "信息学院";
    }

    private class Itr implements Iterator {
        private int position = -1;
        @Override
        public boolean hasNext() {
            if (position >= InfoCollege.this.departmentList.size() -1) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Object next() {
            return InfoCollege.this.departmentList.get(++position);
        }
    }
}
