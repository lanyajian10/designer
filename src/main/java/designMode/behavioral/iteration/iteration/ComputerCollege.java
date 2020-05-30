package designMode.behavioral.iteration.iteration;

import designMode.behavioral.iteration.common.Department;

import java.util.Iterator;

/**
 * @author YJ Lan
 * @create 2020-05-24-13:25
 */
public class ComputerCollege implements College {

    private Department[] arr ;

    public ComputerCollege(){
        arr = new Department[5];
        arr[0] = new Department("C语言");
        arr[1] = new Department("PHP");
        arr[2] = new Department("JAVA");
    }

    @Override
    public Iterator getIterator() {
        return new Itr();
    }

    @Override
    public String name() {
        return "计算机学院";
    }


    private class Itr implements Iterator {

        int index = 0;

        @Override
        public boolean hasNext() {
            if (index >= ComputerCollege.this.arr.length
                    || ComputerCollege.this.arr[index] == null ) {
                return false;
            } else {
                return true;
            }

        }

        @Override
        public Object next() {
            return ComputerCollege.this.arr[index++];
        }
    }
}
