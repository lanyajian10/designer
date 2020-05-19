package designMode.structural.composite;

/**
 * @author YJ Lan
 * @create 2020-05-19-23:33
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite();
        root.add(new Leaf());
        root.add(new Composite());
        root.display();
    }
}
