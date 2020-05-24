package designMode.behavioral.mediator.customer.A;

import designMode.behavioral.mediator.customer.Colleague;
import designMode.behavioral.mediator.mediator.Mediator;

/**
 * @author YJ Lan
 * @create 2020-05-24-16:41
 */
public class Alarm extends Colleague {

    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void senMessage(int state) {
        getMediator().getMessage(state,getName());
    }

}
