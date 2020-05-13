package principle.test2.interfaceSegregationPrinciple;

/**
 * 违反接口隔离原则(Interface Segregation Principle ISP)
 * @author YJ Lan
 * @create 2020-05-12-22:22
 */
public class InterfaceSegregation1 {
}
/**
 * 违反了接口隔离原则

interface interfaces {
    void options1();
    void options2();
    void options3();
}
class A implements interfaces {
    @Override
    public void options1() {
    }

    @Override
    public void options2() {
    }

    @Override
    public void options3() {
    }
}
class B implements interfaces {
    @Override
    public void options1() {
    }

    @Override
    public void options2() {
    }

    @Override
    public void options3() {
    }
}


class C  {
    public void run1(interfaces interfaces){
        interfaces.options1();
    }
    public void run2(interfaces interfaces){
        interfaces.options3();
    }
    public void run3(interfaces interfaces) {
        interfaces.options2();
    }
}
class D {
    public void run1(interfaces interfaces) {
        interfaces.options1();
    }
}
 */