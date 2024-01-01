package 设计模式原则.接口隔离原则.修改前;

/**
 * Description: 测试类，让程序员开始进行某种活动
 *
 * @author Ashes
 * @date 2024/1/2 0:04
 */
public class main {
    public static void main(String[] args) {
        Worker worker = new Programmer();
        worker.eat();//打印"吃饭"
    }
}
