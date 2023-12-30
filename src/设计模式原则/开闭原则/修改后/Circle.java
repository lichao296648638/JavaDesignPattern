package 设计模式原则.开闭原则.修改后;
/**
 * Description:
 * 修改后的圆形类，如果需要绘画功能，实现Shape这个接口即可
 *
 * @author Ashes
 * @date 2023/12/26
 *
 */
public class Circle implements Shape{

    /**
     * 画圆功能
     */
    @Override
    public void draw() {
            System.out.println("画圆");
    }
}
