package designMode.behavioral.interpreter.abs;

import java.util.Map;

/**
 * var={
 * "a" : 10,
 * "b" : 20
 * }
 * @author YJ Lan
 * @create 2020-05-27-23:00
 */
public class VarExpression extends Expression {

    private String key;

    public VarExpression(String key){
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(key);
    }
}
