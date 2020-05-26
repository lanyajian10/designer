package designMode.behavioral.status;

import designMode.behavioral.status.status.Paying;

/**
 * @author YJ Lan
 * @create 2020-05-25-23:33
 */
public class Client {

    public static void main(String[] args) {

        Context context = new Context(new Paying());
        context.start();

    }
}
