package designMode.behavioral.command;

/**
 * @author YJ Lan
 * @create 2020-05-21-23:28
 */
public class TVOnCommand implements Command {

    private TV tv;

    public TVOnCommand(TV tv){
        this.tv = tv;
    }

    public void execute() {
        tv.on();
    }

    public void undo() {
        tv.off();
    }
}
