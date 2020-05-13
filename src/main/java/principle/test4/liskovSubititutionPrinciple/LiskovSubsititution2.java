package principle.test4.liskovSubstitutionPrinciple;

/**
 * 里氏替换原则
 * @author YJ Lan
 * @create 2020-05-13-21:07
 */
public class LiskovSubsititution2 {
}

/**
 *

class Base {
    //A1 B1公共部分
}
class A1 extends Base{
    public void option1(){}
}
class B1 extends Base {
    public void option2(){}
    //如果一定要使用option1,可以使用组合（或者依赖、聚合）的方式
    A1 a = new A1();
    public void option3(){
        a.option1();
    }
} */