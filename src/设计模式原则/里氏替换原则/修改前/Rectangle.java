package 设计模式原则.里氏替换原则.修改前;
/**
 * Description:
 * 这是一个长方形类
 *
 * @author Ashes
 * @date 2023/12/28
 *
 */
public class Rectangle {
    int width;
    int height;

    public void setWidth(int width) {
        this.width = width;
    }


    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * 计算长方形面积
     * @return 计算后得出的面积
     */
    public int calculateArea() {
        return width * height;
    }


}
