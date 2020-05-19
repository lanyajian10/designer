package designMode.structural.composite;

/**
 * @author YJ Lan
 * @create 2020-05-19-23:28
 */
public interface Component {

    void add(Component component);
    void remove(Component component);
    void display();
}
