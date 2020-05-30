package designMode.behavioral.observer.beObServer;

import designMode.behavioral.observer.observer.ObServer;

/**
 * @author YJ Lan
 * @create 2020-05-24-15:28
 */
public interface Subject {

    void registerObserver(ObServer obServer);
    void removeObserver(ObServer obServer);
    void notifyObserver();
}
