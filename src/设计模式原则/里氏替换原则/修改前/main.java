package 设计模式原则.里氏替换原则.修改前;
/**
 * @author 李超
 * @date 2023-12-28
 *
 * @里氏替换原则是说：
 * 你应当保证当你在程序中用子类型全部替换掉父类型时，不可影响程序的正确性！
 * 为什么呢？
 *
 * @该类问题:
 * @see #calculateArea(Rectangle)
 * 这个方法的参数如果是长方形类型
 * @see Rectangle
 * 工作良好，但由于我们的正方形子类
 * @see Square
 * 复写了长方形中的
 * @see Square#setWidth(int)
 * 和
 * @see Square#setHeight(int)
 * 方法，而calculateArea(Rectangle)方法中又同时设置了宽高，
 * 所以真正的正方形的边长是你最后一次设置的正方形的宽或者高。
 * 但是该法中设置了“10”和“50”两个数值，这里的问题就在于：
 * 哪个边长才是正确的边长呢？这就会带来预期值上的错误。
 * 那么也就是说，当我们把父类型“RectAngle”替换成子类型“Square”时，
 * 发生了一些错误。这违反了里氏替换原则！
 *
 * @我们应当:
 * 1.尽量不要复写父类中的方法，若有需要请通过添加新方法的方式替代。
 * 2.如要复写父类方法，请保证子类方法接受的参数比父类更多来区别操作。
 * 3.子类方法也不应该抛出比父类方法中更多或者更宽泛的异常，这会破坏调用者对父类的预期。
 *
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
