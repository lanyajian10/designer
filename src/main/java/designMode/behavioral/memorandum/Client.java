package designMode.behavioral.memorandum;

/**
 * @author YJ Lan
 * @create 2020-05-24-17:31
 */
public class Client {
    public static void main(String[] args) {
        Originator before = new Originator(1000, 100);
        Caretaker caretaker = new Caretaker();
        caretaker.add(1, before.save());
        before.setDefenseNum(1000);
        before.setLiftNum(10);
        caretaker.add(2, before.save());
        System.out.println("目前状态"+before.toString());
        before.getDataFromMemorandum(caretaker.get(1));
        System.out.println("完全体状态："+before.toString());
    }
}
