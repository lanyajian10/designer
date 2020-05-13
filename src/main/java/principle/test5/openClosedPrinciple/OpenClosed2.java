package principle.test5.openClosedPrinciple;

/**
 * 开闭原则
 * @author YJ Lan
 * @create 2020-05-13-21:24
 */
public class OpenClosed2 {
}

/**
 * 抽象类 图形，  所有图形都继承它
 * 那么如果增加三角形，只需要增加新的三角形类即可，无需修改任何代码

class GraphicEditor1 {
    Shape1 shape1;
    public GraphicEditor1(Shape1 shape){
        this.shape1 = shape;
    }
    public void draw (){
        shape1.draw();
    }
}
//接口
abstract class Shape1 {
    abstract void draw();
}
class Rectangle1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("矩形");
    }
}
class Cricle1 extends Shape1 {
    @Override
    void draw() {
        System.out.println("圆形");
    }
}
 */