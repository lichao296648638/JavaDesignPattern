package 设计模式原则.开闭原则.修改后;
/**
 * @author 李超
 * @date 2023-12-26
 * 修改后的三角形类，如果需要绘画功能，实现Shape这个接口即可
 */
public class Triangle implements Shape{

    /**
     * 三角形绘制功能
     */
    @Override
    public void draw() {
        System.out.println("画三角形");
    }
}
