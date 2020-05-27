package designMode.behavioral.interpreter.abs;

import java.util.Map;

/**
 * 加法解释器
 * @author YJ Lan
 * @create 2020-05-27-23:05
 */
public class AddExpression extends SymbolExpression {

    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
