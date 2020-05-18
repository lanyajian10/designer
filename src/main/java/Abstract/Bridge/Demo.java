package Abstract.Bridge;

/*
    桥接模式
 */
class Color
{
    public String color;
}
class Red extends Color
{
    public Red(){
        this.color = "red";
    }
}
class Blue extends Color
{
    public Blue(){
        this.color = "blue";
    }
}
interface Brush
{
    void Paint(Color c);
}
class BigBrush implements Brush
{
    public void Paint(Color c)
    {
        System.out.println("Using big brush and color  painting："+c.color);
    }
}
class smallBrush implements Brush
{
    public void Paint(Color c) {
        System.out.println("Useing small brush and color  painting："+c.color);
    }
}
public class Demo
{
    public static void main(String[] args)
    {
        Brush brush = new BigBrush();
        brush.Paint(new Red());
        brush.Paint(new Blue());
        brush = new smallBrush();
        brush.Paint(new Blue());
        brush.Paint(new Red());
    }
}
