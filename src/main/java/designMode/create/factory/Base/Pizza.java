package designMode.create.factory.Base;

/**
 * @author YJ Lan
 * @create 2020-05-17-19:30
 */
public abstract class Pizza {

    public String name;

    public abstract void prepare();

    public void make(){
        System.out.println(name + "制作完成...");
    }

    public void cut(){
        System.out.println(name + "切成块...");
    }

}
