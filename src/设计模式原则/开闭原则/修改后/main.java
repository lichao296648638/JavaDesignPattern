package 设计模式原则.开闭原则.修改后;

/**
 * @author 李超
 * @date 2013-12-26
 *
 * @类介绍
 * 这是一个检测不同图形就能绘制对应图形的类
 *
 */
public class main {

    public static void main(String[] args) {
        drawShape(new Circle());
        drawShape(new Triangle());
    }

    /**
     * 根据图形形状绘制图形
     * 利用了多态，无需关心具体的图形类型就可绘制
     *
     * @param shape 图形形状，包含（Circle Triangle）两种
     * @see Circle
     * @see Triangle
     */
    static void drawShape(Shape shape) {
        shape.draw();
    }
}
