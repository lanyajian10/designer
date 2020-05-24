package designMode.behavioral.memorandum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author YJ Lan
 * @create 2020-05-24-17:28
 */
public class Caretaker {
    private Map<Integer,Memorandum> memorandumMap;
    public Caretaker(){
        memorandumMap = new HashMap<>();
    }

    public void add(int num, Memorandum memorandum){
        memorandumMap.put(num, memorandum);
    }

    public Memorandum get(int num){
        if (memorandumMap.containsKey(num)) {
            return memorandumMap.get(num);
        } else {
            return null;
        }
    }
}
