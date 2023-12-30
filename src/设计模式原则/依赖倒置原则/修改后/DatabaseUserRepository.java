package 设计模式原则.依赖倒置原则.修改后;

/**
 * Description:
 * 这是一个用户集中的一个基础用户类,含有存储用户基本数据操作
 *
 * @author Ashes
 * @date 2023/12/31 1:19
 *
 */
public class DatabaseUserRepository implements UserRepository{
    @Override
    public void saveName(String name) {
        System.out.println("用户姓名:" + name + "已存储");
    }

    @Override
    public void pay(int money) {
        System.out.println("我光存储不花钱！");
    }
}
