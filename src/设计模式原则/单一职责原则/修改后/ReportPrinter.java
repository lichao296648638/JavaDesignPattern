package 设计模式原则.单一职责原则.修改后;
/**
 * @author 李超
 * @date 2023-12-26
 *
 * @类介绍：
 * 这是一个打印报告的类
 */
public class ReportPrinter {
    /**
     * 打印报告
     * @param report 一个报告对象
     * @see Report
     */
    public void printReport(Report report) {
        System.out.println("打印报告");
    }
}