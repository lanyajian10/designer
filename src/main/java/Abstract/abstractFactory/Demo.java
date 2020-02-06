/**
 * 抽象工厂模式
 * 产品族      -----奥迪   大众
 * 产品等级：   -----高配  低配
 */

package Abstract.abstractFactory;




//车的抽象类
interface Car
{
    void start();
    void stop();
}
//车的父类
class CarImpl implements Car
{
    private String name ;
    private int speed ;

    public String getName()
    {
        return name;
    }

    public CarImpl setName(String name)
    {
        this.name = name;
        return this;
    }

    public int getSpeed()
    {
        return speed;
    }

    public CarImpl setSpeed(int speed)
    {
        this.speed = speed;
        return this;
    }


    public void start()
    {

    }

    public void stop()
    {

    }
}
//奥迪
class AuDi extends CarImpl
{
    @Override
    public void start()
    {

        System.out.println("豪华版"+this.getName()+"车以专利启动了，最高速度为："+this.getSpeed());
    }

}
class W extends CarImpl
{
    @Override
    public void start() {
        System.out.println("豪华版"+this.getName()+"车以专利启动了，最高速度为："+this.getSpeed());
    }
}
class AuDiLow extends CarImpl
{
    @Override
    public void start() {
        System.out.println("低配版"+this.getName()+"车以专利启动了，最高速度为："+this.getSpeed());
    }
}
class WLow extends CarImpl
{
    @Override
    public void start() {
        System.out.println("低配版版"+this.getName()+"车以专利启动了，最高速度为："+this.getSpeed());
    }
}
interface Car_Factory
{
    Car getAuDi();
    Car getW();
}
class Car_Factory_dev implements Car_Factory
{

    public Car getAuDi() {
        return new AuDi().setName("奥迪A6").setSpeed(300);
    }

    public Car getW() {
        return new W().setName("大众A6").setSpeed(300);
    }
}
class Car_Factory_low implements Car_Factory
{

    public Car getAuDi() {
        return new AuDiLow().setName("奥迪A6").setSpeed(300);
    }

    public Car getW() {
        return new WLow().setName("大众A6").setSpeed(300);
    }
}

public class Demo
{
    public static void main(String[] args)
    {
        //生产高级奥迪A6
        Car car = new Car_Factory_dev().getAuDi();
        car.start();
        System.out.println("------------------------");

        Car w = new Car_Factory_low().getW();
        w.start();
    }
}
