package 设计模式原则.依赖倒置原则.修改前;

/**
 * Description:
 * 这是一个用户数据集中的一个基础用户类,含有存储用户基本数据操作
 *
 * @author Ashes
 * @date 2023/12/31
 *

 *
 */
public class DatabaseUserRepository {
    public void saveName(String name) {
        System.out.println("用户姓名:" + name + "已存储");
    }
}
