package 设计模式原则.接口隔离原则.修改前;

/**
 * Description: 这是一个程序员类，程序员可以做一些事情
 *
 * @author Ashes
 * @date 2024/1/2 0:01
 */
public class Programmer implements Worker{
    @Override
    public void eat() {
        System.out.println("吃饭");
    }

    @Override
    public void work() {

    }
}
