package designMode.behavioral.observer.observer;

/**
 * @author YJ Lan
 * @create 2020-05-24-15:36
 */
public class CurrentObServer implements ObServer {
    @Override
    public void update(String weather) {
        System.out.println("天气变为："+weather);
    }
}
