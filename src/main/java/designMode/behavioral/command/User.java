package designMode.behavioral.command;

/**
 * @author YJ Lan
 * @create 2020-05-21-23:31
 */
public class User {

    private  Command[] on;
    private  Command[] off;
    private  Command undo;


    public User(int count){
        on = new Command[count];
        off = new Command[count];
    }

    public void register(int count, Command on, Command off){
        this.on[count] = on;
        this.off[count] = off;
    }

    public void on(int count){
        System.out.println("打开它！");
        this.on[count].execute();
        undo = this.on[count];
    }

    public void off(int count){
        System.out.println("关闭它！");
        this.off[count].execute();
        //记录操作
        undo = this.off[count];
    }

    public void undo(){
        System.out.println("取消命令...");
        undo.undo();
    }

    //#####################################################

    class Video implements Command{

        @Override
        public void execute() {
            System.out.println("VIDEO打开");
        }

        @Override
        public void undo() {
            System.out.println("VIDEO关闭");
        }
    }

    public void videoOn(){

        execute(new Video());
    }

    private void execute(Command command){
        System.out.println("打开VIDEO！");
        command.execute();
    }
}
