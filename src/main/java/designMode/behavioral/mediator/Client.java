package designMode.behavioral.mediator;

import designMode.behavioral.mediator.customer.A.Alarm;
import designMode.behavioral.mediator.customer.B.Remote;
import designMode.behavioral.mediator.customer.B.TV;
import designMode.behavioral.mediator.mediator.ConcreteMediator;

/**
 * @author YJ Lan
 * @create 2020-05-24-17:00
 */
public class Client {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        Alarm alarm = new Alarm(concreteMediator, "alarm");
        TV tv = new TV(concreteMediator, "TV");
        Remote remote = new Remote(concreteMediator, "remote");
        alarm.senMessage(0);
        alarm.senMessage(1);
    }
}
