package designMode.behavioral.interpreter.abs;

import java.util.Map;

/**
 * 减法解释器
 * @author YJ Lan
 * @create 2020-05-27-23:04
 */
public class SubExpression extends SymbolExpression {

    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) - super.right.interpreter(var);
    }
}
