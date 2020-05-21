package designMode.behavioral.command;

/**
 * @author YJ Lan
 * @create 2020-05-21-23:45
 */
public class Client {
    public static void main(String[] args) {
        TV tv = new TV();
        Command tvOnCommand = new TVOnCommand(tv);
        Command tvOffCommand = new TVOffCommand(tv);

        User user = new User(5);
        user.register(0, tvOnCommand, tvOffCommand);
        user.on(0);
        user.off(0);
        user.undo();


        user.videoOn();
    }
}
