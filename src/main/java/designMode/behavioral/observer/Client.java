package designMode.behavioral.observer;

import designMode.behavioral.observer.beObServer.WeatherData;
import designMode.behavioral.observer.observer.CurrentObServer;

/**
 * @author YJ Lan
 * @create 2020-05-24-15:36
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentObServer currentObServer = new CurrentObServer();
        weatherData.registerObserver(currentObServer);
        weatherData.setWeather("晴天");
        weatherData.setWeather("阴天");

    }
}
