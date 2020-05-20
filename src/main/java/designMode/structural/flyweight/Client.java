package designMode.structural.flyweight;

/**
 * @author YJ Lan
 * @create 2020-05-20-21:54
 */
public class Client {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite news = webSiteFactory.getWebSite("新闻");
        news.use(new User("lan"));


        WebSite boke = webSiteFactory.getWebSite("博客");
        boke.use(new User("lll"));


        WebSite news1 = webSiteFactory.getWebSite("新闻");
        news1.use(new User("及哈哈"));

        System.out.println(webSiteFactory.getSize());
    }
}
