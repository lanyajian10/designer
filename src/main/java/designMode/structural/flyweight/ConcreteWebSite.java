package designMode.structural.flyweight;

/**
 * type 属于内部状态
 * @author YJ Lan
 * @create 2020-05-20-21:50
 */
public class ConcreteWebSite extends WebSite {

    private String type;

    public ConcreteWebSite(String type){
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("使用了"+type+"网站...用户是："+user.getName());
    }
}
