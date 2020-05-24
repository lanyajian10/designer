package designMode.behavioral.iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author YJ Lan
 * @create 2020-05-24-13:21
 */
public class Client {
    public static void main(String[] args) {
        Colleges colleges = new Colleges();
        colleges.add(new ComputerCollege());
        colleges.add(new InfoCollege());
        colleges.showColleges();
    }
}

class Colleges {

    private List<College> colleges = new ArrayList<>();

    public void add(College college){
        colleges.add(college);
    }

    public void showColleges(){
        Iterator<College> iterator = colleges.iterator();
        while (iterator.hasNext()) {
            College next = iterator.next();
            System.out.println("============"+next.name()+"============");
            showDept(next);
        }
    }

    private void showDept(College college){
        Iterator iterator = college.getIterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next.toString());
        }
    }
}
