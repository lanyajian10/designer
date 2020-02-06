/**
 * 命令模式
 * 1.抽象命令角色Commond
 * 2.具体命令角色CommondOn、CommondOff、CommondChange
 * 3.请求者角色CommondManager
 * 4.接受者角色TV
 * 5.客户端Client
 */
package Abstract.commond;
class CommondManager
{
    private Commond commondOn;
    private Commond commondOff;
    private Commond commondChange;
    public CommondManager( Commond on , Commond off ,Commond change )
    {
        this.commondChange = change;
        this.commondOn = on;
        this.commondOff = off;
    }
    public void turnOn()
    {
        commondOn.execute();
    }
    public void turnOff()
    {
        commondOff.execute();
    }
    public void change()
    {
        commondChange.execute();
    }
}
interface Commond
{
    void execute();
}
class CommondOn implements Commond
{
    private TV myTv;
    public CommondOn(TV tv )
    {
        this.myTv = tv;
    }
    public void execute() {
        myTv.turnOn();
    }
}
class CommondOff implements Commond
{
    private TV myTv;
    public CommondOff( TV tv)
    {
        this.myTv = tv;
    }
    public void execute()
    {
        myTv.turnOff();
    }
}
class CommondChange implements Commond
{
    private TV myTv;
    private int channel;
    public CommondChange( TV tv ,int currentChannel )
    {
        this.myTv = tv;
        this.channel = currentChannel;
    }
    public void execute()
    {
        myTv.change(channel);
    }
}
class TV
{
    public int currentChannel = 0;
    public TV ()
    {
    }
    public void turnOn()
    {
        System.out.println("打开电视");
    }
    public void turnOff()
    {
        System.out.println("关机");
    }
    public void change(int channel){
        this.currentChannel = channel;
        System.out.println(" Now TV channel is : "+currentChannel);
    }
}
public class  Client
{
    public static void main(String[] args)
    {
        //创建   接受者 --------  包含具体的执行处理逻辑
        TV tv = new TV();
        // 创建具体命令对象，并  指定其 接受者
        Commond on = new CommondOn(tv);
        Commond off = new CommondOff(tv);
        Commond change = new CommondChange(tv,2);
        // 请求者  负责调用  命令对象Commond 执行这个请求
        CommondManager commondManager = new CommondManager(on, off, change);
        commondManager.turnOn();
        commondManager.change();
        commondManager.turnOff();
    }
}
