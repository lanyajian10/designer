/**
 *组合模式（树形结构）
 */
package Abstract.group;

import java.util.ArrayList;
import java.util.List;


/**
 * 抽象根类
 */
abstract class Component  {
    protected String name;
    public Component(String name){
        this.name = name;
    }
    public abstract void Add(Component c);//添加树叶/树枝
    public abstract void Remove(Component c);//移除
    public abstract void Display(int depth);//打印/显示
    public void abc(){
        System.out.println("666");
    }
//    public Iterator iter(){return  null;}
}

/**
 * 枝节点
 */
class Composite extends Component{
    private List<Component> children = new ArrayList<Component>();

//    private int i = 0;
//    public Iterator iter() {
//
//        return children.iterator();
//    }
//
//    public boolean hasNext()
//    {
//        return i<children.size();
//    }
//    public Object next()
//    {
//        if( hasNext())
//            return children.get(i++);
//        else
//            throw  new NoSuchElementException();
//    }




    public Composite(String name ){
        super(name);
    }

    @Override
    public void Add(Component c) {
        children.add(c);
    }

    @Override
    public void Remove(Component c) {
        children.remove(c);
    }

    @Override
    public void Display(int depth) {
        for (int i =0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(name);
        for ( Component c: children){
            c.Display(depth+2);
        }
    }
}


/**
 * 叶节点
 */
class Leaf extends Component{

    public Leaf (String name) {
        super(name);
    }

    @Override
    public void Add(Component c) {
        //叶节点无需增加分支和树叶，所以直接实现
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void Remove(Component c) {
        System.out.println("Cannot remove to a leaf");
    }

    @Override
    public void Display(int depth) {
        for (int i =0;i<depth;i++){
            System.out.print("-");
        }
        System.out.println(name);
    }

}



public class Demo {
    public static void main(String[] args) {
        //根节点实例化
        Component  root= new Composite(" root ");
        //分枝X
        Composite  composite= new Composite(" Composite X ");
        //分枝X上添加的叶子
        composite.Add(new Leaf(" Leaf XA "));
        composite.Add(new Leaf(" Leaf XB "));
        //添加到主根上
        root.Add(composite);
        //分枝Y
        Composite composite1 = new Composite(" Composite Y ");
        //添加Y到主根上
        root.Add(composite1);
        //分枝Y上添加的叶子
        composite1.Add(new Leaf(" Leaf YA "));
        composite1.Add(new Leaf(" Leaf YB "));


//        root.Remove(composite1);
        root.Display(1);
    }
}
