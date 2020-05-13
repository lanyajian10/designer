package principle.test1.singleResponsibityPrinciple;

/**
 * 单一职责原则(SingleResponsibityPrinciple SRP)
 * 一个类只负责一项职责
 * @author YJ Lan
 * @create 2020-05-12-21:27
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        vehicle.run("飞机");
//        vehicle.run("汽车");
//        vehicle.run("轮船");
    }
}

/**
 * 1. 违反了单一职责原则
 * 2. 解决办法：根据交通工具的运行方式不同，分解成不同的类

class Vehicle {
    public void run(String name) {
        System.out.println(name+"在地上跑。。。");
    }
} */