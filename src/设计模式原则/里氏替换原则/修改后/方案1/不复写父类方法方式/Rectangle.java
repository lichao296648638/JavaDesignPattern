package 设计模式原则.里氏替换原则.修改后.方案1.不复写父类方法方式;
/**
 * Description:
 * 这是一个长方形类
 *
 * @author Ashes
 * @date 2023/12/28
 *
 */
public class Rectangle {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 计算长方形面积
     * 因为子类直接调用该方法有可能会发生预期错误
     * 所以改为了私有，不再允许正方形使用，这样一来
     * 若子类想计算必须实现自己的计算功能。
     * @return 计算后得出的面积
     */
    private int calculateArea() {
        return width * height;
    }

    /**
     * 由于计算方法私有化，我们需要通过getter方法对外暴露
     */
    public int getArea() {
        return calculateArea();
    }


}
