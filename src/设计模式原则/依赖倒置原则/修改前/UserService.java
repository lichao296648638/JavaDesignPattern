package 设计模式原则.依赖倒置原则.修改前;

/**
 * Description
 * 这是一个用户服务类，用来对用户数据进行管理
 *
 * @author Ashes
 * @date 2023/12/31
 *
 * @依赖倒置原则是说：
 * 高层模块不应直接依赖于底层模块，高层模块和底层模块都应依赖于抽象，
 * 抽象不应依赖于其实现，实现应依赖于抽象。通过抽象的方式来对高层和底层进行解耦。
 *
 *@该类存在问题：
 * @see UserService
 * 就属于高层模块
 * 而
 * @see DatabaseUserRepository
 * 属于底层模块，高层模块负责业务逻辑，而底层模块负责维护和执行。
 * 假设这里我新添加一个用户行为类MethodUserRepository，该类有一个pay()方法会发生什么？
 * 我可能会在UserService中进行具体的用户集类型进行具体判断，然后执行对应代码。
 * 这就造成了UserService与底层模块耦合紧密，一但有新需求就要重新维护此类。
 *
 * @我们应当：
 * 通过抽象类或者接口的方式讲用户的核心逻辑抽象出一个抽象层，让高层模块依赖于抽象。
 * 让底层模块去实现抽象，实现高层和底层的解耦。
 *
 */
public class UserService {
    DatabaseUserRepository databaseUserRepository;

    UserService(DatabaseUserRepository databaseUserRepository) {
        this.databaseUserRepository = databaseUserRepository;
    }

    public void createUser() {
        databaseUserRepository.saveName("测试用户");
    }

}
