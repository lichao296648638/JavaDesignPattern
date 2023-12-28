package 设计模式原则.里氏替换原则.修改后.方案1.不复写父类方法方式;

/**
 * @author 李超
 * @date 2023-12-28
 *
 * @类介绍
 * 这是一个正方形类，不复写父类的方法，而是加入别的方法
 */
public class Square extends Rectangle {

    private int side;
    /**
     * 设置正方形边长,为了符合里氏替换原则这里添加新方法
     *
     * @param side 要设置的正方形的边长
     */
    public void setSide(int side) {
        this.side = side;
    }

    /**
     * 计算正方形面积,为了符合里氏替换原则这里添加新方法
     * @return 计算后的面积
     */
    public int calculateSquareArea() {
        return side * side;
    }
}
