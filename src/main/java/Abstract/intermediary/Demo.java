/**
 * 中介模式----相亲
 * man  男方
 * manP 男方父母
 * woman 女方
 * womanP 女方父母
 * matchmaker 中介
 * Demo  开始介绍
 *
 */
package Abstract.intermediary;
class Man
{
    private MatchMaker mat ;
    public Man ( MatchMaker matchMaker)
    {
        this.mat = matchMaker;
        mat.manRegist(this);
    }
    //考虑
    public void think( String says )
    {
        if ( says.length()>5 )
            System.out.println("我同意了");
        else
            System.out.println("太内向，我不喜欢");
    }
    //提出约会
    public void tryst ( String says )
    {
        System.out.println("-------------男方提出约会，说："+says);
        mat.doManTry( says );
        System.out.println("-------------处理完毕----------------------");
    }
}
class ManP
{
    private MatchMaker mat ;
    public ManP( MatchMaker matchMaker )
    {
        this.mat = matchMaker;
        mat.manPRegist(this);
    }
    //考虑
    public void think( String says )
    {
        if (says.length()>5)
            System.out.println("男方父母同意！");
        else
            System.out.println("男方父母不同意!!!");
    }
}
class Woman
{
    private MatchMaker mat;
    public Woman( MatchMaker matchMaker )
    {
        this.mat = matchMaker;
        mat.womanRegist(this);
    }
    //考虑
    public void think( String says )
    {
        if ( says.length()>5 )
            System.out.println("女方:我同意啦。。。");
        else
            System.out.println("女方：我不同意...");
    }
    //提出
    public void tryst( String says )
    {
        System.out.println("----------女方提出约会，说："+says );
        mat.doWomanTry( says );
        System.out.println("----------处理约会请求结束-------------");
    }
}
class WomanP
{
    private MatchMaker mat;
    public WomanP( MatchMaker matchMaker )
    {
        this.mat = matchMaker;
        mat.womanPRegist(this);
    }
    public void think( String says )
    {
        if ( says.length()>5 )
            System.out.println("女方父母同意啦。。。。");
        else
            System.out.println("女方父母不同意......");
    }
}
class MatchMaker
{
    private Man man;
    private Woman woman;
    private ManP manP;
    private WomanP womanP;

    public void manRegist( Man man)
    {
        this.man = man;
    }
    public void womanRegist( Woman woman )
    {
        this.woman = woman;
    }
    public void womanPRegist( WomanP womanP )
    {
        this.womanP = womanP;
    }
    public void manPRegist( ManP manP )
    {
        this.manP = manP;
    }
    //男方提出
    public void doManTry( String says )
    {
        woman.think(says);
        manP.think(says);
        womanP.think(says);
    }
    //女方提出
    public void doWomanTry( String says )
    {
        man.think(says);
        manP.think(says);
        womanP.think(says);

    }
}
public class Demo {
    public static void main(String[] args) {
        MatchMaker matchMaker = new MatchMaker();
        Man man = new Man(matchMaker);
        Woman woman = new Woman(matchMaker);
        ManP manP = new ManP(matchMaker);
        WomanP womanP = new WomanP(matchMaker);
        System.out.println("--------------------男方提出约会-------------------------");
        man.tryst("我感觉咱俩聊得来。要不？");
        System.out.println("--------------------女方提出约会-------------------------");
        woman.tryst("我..");
    }
}
