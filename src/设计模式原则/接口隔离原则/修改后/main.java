package 设计模式原则.接口隔离原则.修改后;

/**
 * Description: 测试类，让程序员开始进行某种活动。
 * 通过拆分工人活动，实现了一个仅能吃饭的程序员。
 *
 * @author Ashes
 * @date 2024/1/2 0:04
 *
 *
 */
public class main {
    public static void main(String[] args) {
      Programmer programmer = new Programmer();
      programmer.eat();//打印"吃饭"
    }
}
