package 设计模式原则.依赖倒置原则.修改前;
/**
 * Description:
 * 测试类，模拟创建用户操作
 *
 * @author Ashes
 * @date 2023/12/31
 */
public class main {
    public static void main(String[] args) {
        UserService userService = new UserService(new DatabaseUserRepository());
        userService.createUser();//打印“用户姓名:测试用户已存储”
    }
}
