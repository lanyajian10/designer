package designMode.behavioral.template;

/**
 * @author YJ Lan
 * @create 2020-05-21-22:11
 */
public abstract class Template {

    public final void run(){
        select();
        add();
        make();
    }

    public void select (){
        System.out.println("挑选食材，倒水....");
    }

    //钩子方法
    public abstract void add();

    public void make(){
        System.out.println("喝...");
    }
}
