package designMode.behavioral.mediator.customer.B;

import designMode.behavioral.mediator.customer.Colleague;
import designMode.behavioral.mediator.mediator.Mediator;

/**
 * @author YJ Lan
 * @create 2020-05-24-16:44
 */
public class TV extends Colleague {

    public TV(Mediator mediator, String name) {
        super(mediator, name);
        getMediator().register(name, this);
    }

    @Override
    public void senMessage(int state) {
        getMediator().getMessage(state, getName());
    }

    public void open(){
        System.out.println("打开电视...");
    }

    public void close(){
        System.out.println("关闭电视...");
    }
}
