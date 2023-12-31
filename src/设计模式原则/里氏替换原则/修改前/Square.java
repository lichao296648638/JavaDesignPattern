package 设计模式原则.里氏替换原则.修改前;
/**
 * Description:
 * 这是一个正方形类，复写了父类长方形中的设置宽高，和计算面积的办法
 *
 * @author Ashes
 * @date 2023/12/28
 *
 */
public class Square extends Rectangle{

    /**
     * 正方形长宽一致，所以宽可以界定长的值
     *
     * @param width 要设置的正方形的宽
     */
    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }

    /**
     * 正方形长宽一致，所以高可以界定宽的值
     *
     * @param height 要设置的正方形的高
     */
    @Override
    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

}
