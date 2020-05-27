package designMode.behavioral.interpreter.abs;

import java.util.Map;

/**
 * @author YJ Lan
 * @create 2020-05-27-22:58
 */
public abstract class Expression {

    public abstract int interpreter(Map<String,Integer> var);
}
