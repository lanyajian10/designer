package designMode.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 核心  map
 * @author YJ Lan
 * @create 2020-05-20-21:48
 */
public class WebSiteFactory {

    private Map<String,WebSite> map = new HashMap<String, WebSite>();

    public WebSite getWebSite(String type){
        if (!map.containsKey(type)) {
            map.put(type, new ConcreteWebSite(type));
        }
        return map.get(type);
    }

    public int getSize(){
        return map.size();
    }
}
