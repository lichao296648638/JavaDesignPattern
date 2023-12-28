package 设计模式原则.里氏替换原则.修改后.为什么不能比父类抛出更宽泛的异常;

/**
 * @author 李超
 * @date 2023-12-28
 */
public class main {
    public static void main(String[] args) {
        calculateArea(new Rectangle());//打印结果：“矩形面积为：500”
        calculateArea(new Square());//打印结果：“矩形面积为：2500”
    }

    /**
     * 计算矩形的面积
     * @param rectangle 要计算的矩形对象
     * @return 矩形的面积
     */
    public static int calculateArea(Rectangle rectangle) {
        rectangle.setHeight(10);
        rectangle.setWidth(50);
        int area = rectangle.calculateArea();
        System.out.println("矩形面积为：" + area);
        return area;
    }
}
