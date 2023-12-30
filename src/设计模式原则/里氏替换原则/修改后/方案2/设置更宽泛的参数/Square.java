package 设计模式原则.里氏替换原则.修改后.方案2.设置更宽泛的参数;

/**
 * Description:
 * 这是一个正方形类，这里添加了新方法，又设置了更宽泛的参数来复用父类的方法
 *
 * @author Ashes
 * @date 2023/12/28
 *
 */
public class Square extends Rectangle {
    /**
     * 设置正方形边长
     * 这里通过设置更宽泛的参数来达成设置宽高的目的
     * @param side
     */
    public void setSide(int side) {
        setHeight(side);
        setWidth(side);
    }

}
