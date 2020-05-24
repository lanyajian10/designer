package designMode.behavioral.mediator.customer.B;

import designMode.behavioral.mediator.customer.Colleague;
import designMode.behavioral.mediator.mediator.Mediator;

/**
 * @author YJ Lan
 * @create 2020-05-24-16:46
 */
public class Remote extends Colleague {

    public Remote(Mediator mediator, String name) {
        super(mediator, name);
        getMediator().register(name, this);
    }

    @Override
    public void senMessage(int state) {
        getMediator().getMessage(state, getName());
    }

    public void use(){
        System.out.println("找到遥控器....");
    }
}
