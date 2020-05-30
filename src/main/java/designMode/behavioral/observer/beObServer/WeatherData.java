package designMode.behavioral.observer.beObServer;


import designMode.behavioral.observer.observer.ObServer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author YJ Lan
 * @create 2020-05-24-15:27
 */
public class WeatherData implements Subject {

    private List<ObServer> obServerList ;

    private String weather;

    public WeatherData(){
        obServerList = new ArrayList<>();
    }

    public void setWeather(String weather){
        this.weather = weather;
        notifyObserver();
    }


    @Override
    public void registerObserver(ObServer obServer) {
        obServerList.add(obServer);
    }

    @Override
    public void removeObserver(ObServer obServer) {
        if (obServerList.contains(obServer)) {
            obServerList.remove(obServer);
        }
    }

    @Override
    public void notifyObserver() {
        for (ObServer obServer : obServerList) {
            obServer.update(weather);
        }
    }
}
