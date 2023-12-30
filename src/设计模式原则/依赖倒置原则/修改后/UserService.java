package 设计模式原则.依赖倒置原则.修改后;

/**
 * Description
 * 这是一个用户服务类，用来对用户进行管理,通过依赖于
 * @see UserRepository
 * 这个接口
 * 实现了对用户的管理，此时无需再重复维护此类
 *
 * @author Ashes
 * @date 2023/12/31
 *
 */
public class UserService {

    UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser() {
        userRepository.saveName("测试用户");
        userRepository.pay(10);
    }



}
