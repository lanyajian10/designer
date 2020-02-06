/**
 * 观察者模式
 * 地球  Earth    被观察者
 * 气象卫星Satellite 观察者
 * 气象局 Demo       调用者
 */
package Abstract.observer;

import java.util.Observable;
import java.util.Observer;

class Earth extends Observable
{
    private String weather = "晴朗";

    public String getWeather()
    {
        return weather;
    }

    public void setWeather(String weather)
    {
        this.weather = weather;
        //设置变化点
        setChanged();
        //通知
        notifyObservers(weather);
    }

}
class Satellite implements Observer
{
    private String weather ;
    @Override
    public void update(Observable o, Object arg)
    {
        weather = (String)arg;
        System.out.println("近期天气变化:"+weather);
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        Earth earth = new Earth();
        Satellite satellite = new Satellite();
        //发射微型 （添加观察者）
        earth.addObserver(satellite);
        System.out.println("开始播报天气状况：");
        System.out.println("--------------------");
        earth.setWeather("台风来袭");
        earth.setWeather("近期有大到暴雨");
        earth.setWeather("暴雨结束，天气晴朗");
    }
}
