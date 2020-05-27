package designMode.behavioral.interpreter;

import designMode.behavioral.interpreter.abs.AddExpression;
import designMode.behavioral.interpreter.abs.Expression;
import designMode.behavioral.interpreter.abs.SubExpression;
import designMode.behavioral.interpreter.abs.VarExpression;

import java.util.Map;
import java.util.Stack;

/**
 * @author YJ Lan
 * @create 2020-05-27-23:07
 */
public class Calculator {

    private Expression expression;

    public Calculator(String str){
        char[] chars = str.toCharArray();
        Stack<Expression> stack = new Stack<>();
        Expression left = null;
        Expression right = null;
        StringBuffer stringBuffer = null;
        for (int i = 0; i < chars.length-1; i++) {
            switch (chars[i]) {
                case '+':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                default:
                    stack.push(new VarExpression(String.valueOf(chars[i])));
            }
        }
        this.expression = stack.pop();
    }

    public void run(Map<String,Integer> var){
        System.out.println("计算结果是:"+this.expression.interpreter(var));
    }
}
