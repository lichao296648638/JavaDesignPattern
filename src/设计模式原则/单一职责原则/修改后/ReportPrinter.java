package 设计模式原则.单一职责原则.修改后;
/**
 * Description：
 * 这是一个打印报告的类
 * @author Ashes
 * @date 2023/12/26
 *

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