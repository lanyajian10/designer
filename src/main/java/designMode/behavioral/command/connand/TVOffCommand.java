package designMode.behavioral.command.connand;

import designMode.behavioral.command.received.TV;

/**
 * @author YJ Lan
 * @create 2020-05-21-23:29
 */
public class TVOffCommand implements Command {

    private TV tv;

    public TVOffCommand(TV tv){
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
