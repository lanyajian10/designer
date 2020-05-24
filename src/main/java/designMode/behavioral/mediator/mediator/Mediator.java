package designMode.behavioral.mediator.mediator;

import designMode.behavioral.mediator.customer.Colleague;

/**
 * @author YJ Lan
 * @create 2020-05-24-16:33
 */
public abstract class Mediator {

    public abstract void register( String colleagurName, Colleague colleague);

    public abstract void getMessage(int stateChange, String colleagurName);

    public abstract void sendMessage();
}
