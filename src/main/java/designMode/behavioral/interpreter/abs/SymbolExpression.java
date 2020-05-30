package designMode.behavioral.interpreter.abs;

import java.util.Map;

/**
 * 计算符
 * @author YJ Lan
 * @create 2020-05-27-23:03
 */
public class SymbolExpression extends Expression {

    Expression left;
    Expression right;

    public SymbolExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return 0;
    }
}
