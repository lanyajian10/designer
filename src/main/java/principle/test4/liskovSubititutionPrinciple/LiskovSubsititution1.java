package principle.test4.liskovSubstitutionPrinciple;

/**
 * 里氏替换原则 （Liskov Subsititution Principle LSP）
 * （尽量少的重写父类）
 * @author YJ Lan
 * @create 2020-05-13-20:54
 */
public class LiskovSubsititution1 {
}
/**
 * 如果B 重写覆盖了A类的方法，违背里氏替换原则父类要尽可能的透明

class A {
    public void opention1(){

    }
}


class B extends A {
    @Override
    public void opention1() { }
    public void opention2() {}
} */