package designMode.structural.composite;

/**
 * @author YJ Lan
 * @create 2020-05-19-23:32
 */
public class Leaf implements Component {
    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void display() {
        System.out.println("LEAF");
    }
}
