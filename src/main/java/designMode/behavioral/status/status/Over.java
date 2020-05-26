package designMode.behavioral.status.status;

import designMode.behavioral.status.Context;

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
