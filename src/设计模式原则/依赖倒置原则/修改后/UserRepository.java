package 设计模式原则.依赖倒置原则.修改后;

/**
 * Description: 通过创建接口的方式实现一个抽象层，把用户的核心逻辑抽象出来，让高层和底层依赖于它实现解耦
 *
 * @author Ashes
 * @date 2023/12/31 1:19
 */
public interface UserRepository {

    void saveName(String name);

    void pay(int money);
}
