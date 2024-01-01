package 设计模式原则.接口隔离原则.修改后;

/**
 * Description: 这是一个程序员类，程序员可以做一些事情
 *
 * @author Ashes
 * @date 2024/1/2 0:01
 */
public class Programmer implements Eatable {


    @Override
    public void eat() {
        System.out.println("吃饭");
    }
}
//也可以写成这样
//public class Programmer implements Workable {
//
//
//    @Override
//    public void work() {
//        System.out.println("工作");
//    }
//}
//或者
//public class Programmer implements Workable, Eatable {
//
//
//    @Override
//    public void work() {
//        System.out.println("工作");
//    }
//    @Override
//    public void eat() {
//        System.out.println("吃饭");
//    }
//}
