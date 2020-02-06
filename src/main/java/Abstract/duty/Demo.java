package Abstract.duty;

/**
 * 责任型模式
 */
abstract class Player
{
    abstract public void handle( int i );
    private Player using;
    public Player()
    {
        using = null;
    }
    protected void setUsing(Player player)
    {
        this.using = player;
    }
    public void  next(int i )
    {
        if( using!=null )
        {
            using.handle(i);
        }
        else
        {
            System.out.println("rogram terminated");
        }
    }
}
class JiaMu extends Player
{
    public JiaMu(Player player)
    {
        this.setUsing(player);
    }

    @Override
    public void handle(int i)
    {
        if ( i == 1 )
        {
            System.out.println(" JiaMu gotta drink ! ");
        }
        else
        {
            System.out.println(" JiaMu passed ! ");
            next(i);
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Player player = new JiaMu(new JiaShe(new JiaZheng(new JiaBaoYu( new JiaHuan(null)))));
        player.handle(3);
    }
}
class JiaShe extends Player
{
    public JiaShe(Player player)
    {
        this.setUsing(player);
    }

    @Override
    public void handle(int i)
    {
        if ( i == 2 )
        {
            System.out.println(" JiaShe gotta drink ! ");
        }
        else
        {
            System.out.println(" JiaShe passed ! ");
            next(i);
        }
    }
}
class JiaZheng extends Player
{
    public JiaZheng(Player player)
    {
        this.setUsing(player);
    }

    @Override
    public void handle(int i)
    {
        if ( i == 3 )
        {
            System.out.println(" JiaZheng gotta drink ! ");
        }
        else
        {
            System.out.println(" JiaZheng passed ! ");
            next(i);
        }
    }
}
class JiaBaoYu extends Player
{
    public JiaBaoYu(Player player)
    {
        this.setUsing(player);
    }

    @Override
    public void handle(int i)
    {
        if ( i == 4 )
        {
            System.out.println(" JiaBaoYu gotta drink ! ");
        }
        else
        {
            System.out.println(" JiaBaoYu passed ! ");
            next(i);
        }
    }
}
class JiaHuan extends Player
{
    public JiaHuan(Player player)
    {
        this.setUsing(player);
    }

    @Override
    public void handle(int i)
    {
        if ( i == 5 )
        {
            System.out.println(" JiaHuan gotta drink ! ");
        }
        else
        {
            System.out.println(" JiaHuan passed ! ");
            next(i);
        }
    }
}