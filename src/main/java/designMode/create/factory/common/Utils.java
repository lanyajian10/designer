package designMode.create.factory.common;

import java.util.Scanner;

/**
 * @author YJ Lan
 * @create 2020-05-17-19:35
 */
public class Utils {

    public static String getPizzaType(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入想购买的披萨种类");
        return scanner.next();
    }
}
