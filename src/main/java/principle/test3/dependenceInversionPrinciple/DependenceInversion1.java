package principle.test3.dependenceInversionPrinciple;

/**
 * 违反依赖倒置原则（DenpendenceInversionPrinciple DIP）
 * @author YJ Lan
 * @create 2020-05-13-20:11
 */
public class DependenceInversion1 {
}
/**
 * 问题：如果我们想接收彩信、微信等，就需要增加彩信类，改动Persion和客户端
 * 解决方法：引入接口,细节依赖抽象（低级依赖高级）

class Email {
    public String meg(){
        return "这是一封短信";
    }
}


class Person {
    public void receive(Email email){
        System.out.println(email.meg());
    }
}*/