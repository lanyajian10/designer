package principle.test1.singleResponsibityPrinciple;

/**
 * 单一职责原则
 * @author YJ Lan
 * @create 2020-05-12-21:49
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
//        RoadVehicle roadVehicle = new RoadVehicle();
//        AirVehicle airVehicle = new AirVehicle();
//        roadVehicle.run("汽车");
//        airVehicle.run("飞机");
    }
}

/**
 * 严格遵守了 单一职责原则
 * 但是就目前来讲，方法很少，这样会比较臃肿

class RoadVehicle {
    public void run(String name){
        System.out.println(name + "在地上跑...");
    }
}

class AirVehicle {
    public void run(String name){
        System.out.println(name + "在天上飞...");
    }
} */
