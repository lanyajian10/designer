package designMode.behavioral.status.status;

import designMode.behavioral.status.Context;

/**
 * @author YJ Lan
 * @create 2020-05-25-23:24
 */
public class Pay extends State {
    @Override
    public void Handle(Context context) {
        setName("交易成功....");
        context.setState(new Over());
        context.getState().Handle(context);
    }
}
