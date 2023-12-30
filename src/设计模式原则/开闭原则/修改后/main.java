package 设计模式原则.开闭原则.修改后;

/**
 * Description:
 * 这是一个检测不同图形就能绘制对应图形的类
 *
 * @author Ashes
 * @date 2013/12/26
 *
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
