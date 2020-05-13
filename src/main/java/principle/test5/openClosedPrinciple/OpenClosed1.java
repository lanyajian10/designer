package principle.test5.openClosedPrinciple;

/**
 * 开闭原则 （Open Closed Principle OCP）
 * 对扩展开放，对修改关闭（）
 * @author YJ Lan
 * @create 2020-05-13-21:13
 */
public class OpenClosed1 {
}

/**
 * 绘图工具，违背开闭原则
 * 如果我们增加一个绘制三角形，不仅需要增加类，还需要修改 GraphicEditor类，

class GraphicEditor {
    public void drawShape(Shape shape){
        if (shape.type == 1) {
            drawCricle();
        } else if (shape.type == 2){
            drawRectangle();
        } else {
            System.out.println("错误");
        }
    }
    public void drawRectangle (){
        System.out.println("矩形");
    }
    public void drawCricle () {
        System.out.println("圆形");
    }
}
class Shape {
    int type;
}
class Rectangle extends Shape {
    int type=2;
}
class Cricle extends Shape {
    int type=1;
} */