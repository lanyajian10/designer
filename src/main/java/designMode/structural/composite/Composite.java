package designMode.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YJ Lan
 * @create 2020-05-19-23:29
 */
public class Composite implements Component {

    private List<Component> componentList = new ArrayList<>();

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        componentList.remove(component);
    }

    @Override
    public void display() {
        System.out.println("AAAAAA");
        componentList.stream().forEach(item->{
            item.display();
        });
    }
}
