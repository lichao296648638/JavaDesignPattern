package 设计模式原则.里氏替换原则.修改后.方案1.不复写父类方法方式;

/**
 * @author 李超
 * @date 2023-12-28
 *
 *经过修改，程序正确运行，当子类替换父类行为发生时，不再不符合预期值
 */
public class main {
    public static void main(String[] args) {
        calculateArea(new Rectangle());//打印结果：“矩形面积为：500”
        calculateArea(new Square());//打印结果：“矩形面积为：900”
    }

    /**
     * 计算矩形的面积
     * @param rectangle 要计算的矩形对象
     * @return 矩形的面积
     */
    public static int calculateArea(Rectangle rectangle) {
        int area = 0;
        //判断对象的正确类型，分别计算和操作
        if (rectangle.getClass() == Rectangle.class) {
            rectangle.setHeight(10);
            rectangle.setWidth(50);
            area = rectangle.calculateArea();
        } else if(rectangle.getClass() == Square.class){
            Square square = (Square) rectangle;
            square.setSide(30);
            area = square.calculateSquareArea();
        }
        System.out.println("矩形面积为：" + area);
        return area;
    }
}
