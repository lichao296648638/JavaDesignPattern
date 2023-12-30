package 设计模式原则.依赖倒置原则.修改后;

/**
 *  Description:
 *  这是一个测试类，测试了更新需求后的情况
 *
 *  @author Ashes
 *  @date 2023/12/31 1:32
 */
public class main {
    public static void main(String[] args) {
        UserService userService1 = new UserService(new DatabaseUserRepository());
        /*
            打印:
            用户姓名:测试用户已存储
            我光存储不花钱！
         */
        userService1.createUser();

        UserService userService2 = new UserService(new MethodUserRepository());
        /*
            打印:
            我光花钱不存储
            我花了10块钱
         */
        userService2.createUser();
    }
}
