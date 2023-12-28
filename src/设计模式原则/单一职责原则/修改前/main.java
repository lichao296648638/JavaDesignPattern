package 设计模式原则.单一职责原则.修改前;
/**
 * @author 李超
 * @date 2023-12-26
 *
 * @类介绍：
 * 这是一个测试生成和打印报告的类,我们可以看到同一类具有多种职能，不符合单一职责原则！
 * 这势必会造成无论我对打印还是生成功能进行修改时，都会成为修改Report类的原因
 */
public class main {
    public static void main(String[] args) {
        //生成并打印报告
        Report report = new Report();
        report.generateReport();
        report.printReport();
    }
}
