package designMode.behavioral.mediator.customer;

import designMode.behavioral.mediator.mediator.Mediator;

/**
 * @author YJ Lan
 * @create 2020-05-24-16:32
 */
public abstract class Colleague {

    private Mediator mediator;
    private String name;

    public Colleague(Mediator mediator, String name){
        this.mediator = mediator;
        this.name = name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public abstract void senMessage(int state);
}
