package 设计模式原则.依赖倒置原则.修改后;

/**
 * Description: 这是一个用户集中的一个基础用户类,含有某些用户行为的操作
 *
 * @author Ashes
 * @date 2023/12/31 1:29
 */
public class MethodUserRepository implements UserRepository{

    @Override
    public void saveName(String name) {
        System.out.println("我光花钱不存储");
    }

    @Override
    public void pay(int money) {
        System.out.println("我花了"+money+"块钱");
    }
}
