package designMode.behavioral.responsibility.chain;

import designMode.behavioral.responsibility.Request;

/**
 * @author YJ Lan
 * @create 2020-05-26-23:23
 */
public abstract class Handle {

    private Handle handle;

    private String name;

    public Handle(String name) {
        this.name = name;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

    public Handle getHandle() {
        return handle;
    }

    public String getName() {
        return name;
    }

    public abstract void process(Request request);
}
