package principle.test3.dependenceInversionPrinciple;

/**
 * 依赖倒置
 * 1. 通过接口实现
 * 2. 通过构造方法
 * 3. 通过setter方法
 * @author YJ Lan
 * @create 2020-05-13-20:24
 */
public class DependenceInversion2 {
}

/**
 * 方式1  通过接口实现DIP

interface Message{
    void  send();
}
interface Receiver{
    void receive(Message message);
}
class Persions implements Receiver {
    @Override
    public void receive(Message message) {
        message.send();
    }
} */

/**
 * 方式2： 通过构造方法传递

interface Message{
    void  send();
}
interface Receiver{
    void receive();
}
class Persions implements Receiver {
    Message message;
    public Persions(Message message){
        this.message = message;
    }
    @Override
    public void receive() {
        message.send();
    }
} */


/**
 * 方式3： 通过setter实现 （略）
 */