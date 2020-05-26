package designMode.behavioral.status;

import designMode.behavioral.status.status.State;
import lombok.Data;

/**
 * @author YJ Lan
 * @create 2020-05-25-23:19
 */
@Data
public class Context {

    private State state ;

    public Context(State state) {
        this.state = state;
    }

    public void getMsg(){
        System.out.println(state.getName());
    }

    public void start(){
        state.Handle(this);
    }
}
