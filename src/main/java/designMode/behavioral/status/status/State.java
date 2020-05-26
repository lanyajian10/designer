package designMode.behavioral.status.status;

import designMode.behavioral.status.Context;
import lombok.Data;

/**
 * @author YJ Lan
 * @create 2020-05-25-23:18
 */
public abstract class State {

    private String name;

    //每个状态执行的方法
    public abstract void Handle(Context context);

    public void setName(String name) {
        this.name = name;
        System.out.println(name);
    }

    public String getName() {
        return name;
    }
}
