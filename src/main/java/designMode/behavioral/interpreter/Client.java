package designMode.behavioral.interpreter;

import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author YJ Lan
 * @create 2020-05-27-23:20
 */
public class Client {
    public static void main(String[] args) throws Exception {
        String str = getInput();
        Calculator calculator = new Calculator(str);
        calculator.run(getVar(str));
//        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
//        spelExpressionParser.parseExpression("");
    }

    public static String getInput() throws Exception{
        System.out.println("请输入表达式:");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();

    }

    public static Map<String,Integer> getVar(String str){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        char[] chars = str.toCharArray();
        String key = null;
        Integer value = null;
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        for (char aChar : chars) {
            if (aChar !='+' && aChar != '-') {
                System.out.println("请输入第"+count+"个数的值：");
                key = String.valueOf(aChar);
                value = scanner.nextInt();
                map.put(key, value);
                count++;
            }
        }
        return map;
    }
}
