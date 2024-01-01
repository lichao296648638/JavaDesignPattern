package 设计模式原则.合成聚合原则.修改后;

/**
 * Description: 汽车动力源类，不再使用继承，通过组合方式将动力源合成进来
 * @see Engine
 *
 * @author Ashes
 * @date 2024/1/2 0:31
 */
public class Power {
    Engine engine;
    Petroleum petroleum;
    Electricity electricity;

    Power(Petroleum petroleum, Electricity electricity) {
        this.petroleum = petroleum;
        this.electricity = electricity;
    }
}
