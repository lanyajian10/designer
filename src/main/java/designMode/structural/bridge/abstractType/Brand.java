package designMode.structural.bridge.abstractType;

import designMode.structural.bridge.impl.Phone;

/**
 * @author YJ Lan
 * @create 2020-05-18-22:23
 */
public abstract class Brand {

    protected Phone phone ;

    protected String name;

    public void setPhone(Phone phone){
        this.phone = phone;
    }

    protected abstract void use();
}
