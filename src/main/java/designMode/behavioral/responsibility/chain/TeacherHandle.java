package designMode.behavioral.responsibility.chain;

import designMode.behavioral.responsibility.Request;

/**
 * @author YJ Lan
 * @create 2020-05-26-23:25
 */
public class TeacherHandle extends Handle {

    public TeacherHandle(String name) {
        super(name);
    }

    @Override
    public void process(Request request) {
        if (request.getPrice() > 1000) {
            System.out.print(getName()+":无权审核...》》...");
            getHandle().process(request);
        } else {
            System.out.println(getName() + ":审核完成....");
        }
    }
}

