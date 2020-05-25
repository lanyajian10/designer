package designMode.behavioral.status;

/**
 * @author YJ Lan
 * @create 2020-05-25-23:26
 */
public class Over extends State {
    @Override
    public void Handle(Context context) {
        System.out.println("交易结束....");
    }
}
