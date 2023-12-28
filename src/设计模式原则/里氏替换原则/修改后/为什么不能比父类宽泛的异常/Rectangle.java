package 设计模式原则.里氏替换原则.修改后.为什么不能比父类宽泛的异常;

import java.io.IOException;

/**
 * @author 李超
 * @date 2023-12-28
 *
 * @类介绍
 * 这是一个长方形类
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

    /**
     * 一个抛出异常的空方法
     */
    public void throwSomeError() throws IOException {

    }


}
