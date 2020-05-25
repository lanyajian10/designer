package designMode.behavioral.status;

/**
 * @author YJ Lan
 * @create 2020-05-25-23:25
 */
public class NoPay extends State {
    @Override
    public void Handle(Context context) {
        setName("交易关闭....");
        context.setState(new Over());
        context.getState().Handle(context);
    }
}
