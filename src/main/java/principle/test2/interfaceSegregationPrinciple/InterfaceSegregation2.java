package principle.test2.interfaceSegregationPrinciple;

/**
 * 遵守接口隔离原则(Interface Segregation Principle ISP)
 * @author YJ Lan
 * @create 2020-05-12-22:27
 */
public class InterfaceSegregation2 {
    public static void main(String[] args) {
    }
}

/**
 *

interface interface1 {
    void option1();
}
interface interface2 {
    void option2();
    void option3();
}
class E implements interface1 {
    @Override
    public void option1() {
    }
}
class F implements interface2,interface1 {
    @Override
    public void option2() {
    }

    @Override
    public void option3() {
    }

    @Override
    public void option1() {

    }
}
class G {
    public void run(interface1 interface1) {
        interface1.option1();
    }
}
class H {
    public void run1(interface2 interface2) {
        interface2.option2();
    }
    public void run2(interface2 interface2){
        interface2.option3();
    }
    public void run3(interface1 interface1){
        interface1.option1();
    }
} */