package 设计模式原则.合成聚合原则.修改后;

/**
 * Description: 汽车类，不再使用继承方式，通过组合方式将能源合成进来
 * @see Engine
 *
 * @author Ashes
 * @date 2024/1/2 0:31
 *
 */
public class Car {
    Power power;

    Car(Power power) {
        this.power = power;
    }
}
