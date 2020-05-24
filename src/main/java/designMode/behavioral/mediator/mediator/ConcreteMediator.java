package designMode.behavioral.mediator.mediator;

import designMode.behavioral.mediator.customer.A.Alarm;
import designMode.behavioral.mediator.customer.Colleague;
import designMode.behavioral.mediator.customer.B.Remote;
import designMode.behavioral.mediator.customer.B.TV;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YJ Lan
 * @create 2020-05-24-16:49
 */
public class ConcreteMediator extends Mediator {

    private Map<String, Colleague> nameMap ;
    private Map<String ,String> intMap ;

    public ConcreteMediator(){
        nameMap = new HashMap<>();
        intMap = new HashMap<>();
    }

    @Override
    public void register(String colleagurName, Colleague colleague) {
        nameMap.put(colleagurName, colleague);
        if (colleague instanceof Alarm) {
            intMap.put("Alarm", colleagurName);
        } else if (colleague instanceof TV) {
            intMap.put("TV", colleagurName);
        } else if (colleague instanceof Remote) {
            intMap.put("Remote", colleagurName);
        } else {

        }
    }

    @Override
    public void getMessage(int stateChange, String colleagurName) {
        if (nameMap.get(colleagurName) instanceof Alarm) {
            ((Remote)nameMap.get(intMap.get("Remote"))).use();
            if (stateChange == 0) {
                ((TV)nameMap.get(intMap.get("TV"))).open();
            } else {
                ((TV)nameMap.get(intMap.get("TV"))).open();
            }
        } else {

        }
    }

    @Override
    public void sendMessage() {

    }
}
