package principle.test1.singleResponsibityPrinciple;

/**
 *
 * @author YJ Lan
 * @create 2020-05-12-21:53
 */
public class SingleResponsibility3 {
//    public staticProxy void main(String[] args) {
//        Vehicles vehicles = new Vehicles();
//        vehicles.airRun("飞机");
//        vehicles.roadRun("汽车");
//    }
}

/**
 *
 * 虽然在类上没有遵守单一职责原则，但是在方法层面上遵守了

class Vehicles {
    public void roadRun(String name) {
        System.out.println(name + "在地上跑....");
    }
    public void airRun(String name){
        System.out.println(name + "在天上飞....");
    }
}
 */