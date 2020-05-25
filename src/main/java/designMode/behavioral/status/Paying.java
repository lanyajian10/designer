package designMode.behavioral.status;

import java.util.Random;

/**
 * @author YJ Lan
 * @create 2020-05-25-23:21
 */
public class Paying extends State {
    @Override
    public void Handle(Context context) {
        if (new Random().nextInt(2)% 2 == 0) {
            setName("付款成功....");
            context.setState(new Pay());
        } else {
            setName("付款失败...");
            context.setState(new NoPay());
        }
        context.getState().Handle(context);
    }
}
