package designMode.behavioral.observer;

/**
 * @author YJ Lan
 * @create 2020-05-24-15:28
 */
public interface Subject {

    void registerObserver(ObServer obServer);
    void removeObserver(ObServer obServer);
    void notifyObserver();
}
