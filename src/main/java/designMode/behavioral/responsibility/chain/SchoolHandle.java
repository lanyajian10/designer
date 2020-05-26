package designMode.behavioral.responsibility.chain;

import designMode.behavioral.responsibility.Request;

/**
 * @author YJ Lan
 * @create 2020-05-26-23:32
 */
public class SchoolHandle extends Handle {

    public SchoolHandle(String name) {
        super(name);
    }

    @Override
    public void process(Request request) {
        if (request.getPrice()> 5000) {
            System.out.println(getName() + " :审核完成");
        } else {
            System.out.print(getName()+":不需要我审核...》》》...");
            getHandle().process(request);
        }
    }
}
