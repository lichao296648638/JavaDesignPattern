package 设计模式原则.单一职责原则.修改后;

import 设计模式原则.单一职责原则.修改后.Report;

/**
 * @author 李超
 * @date 2023-12-26
 *
 * @类介绍：
 * 这是一个测试生成和打印报告的类
 * 这里遵循了单一职责原则，我们可以清晰地看到报告的生成和打印过程
 */
public class main {
    public static void main(String[] args) {

        //生成报告
        Report report = new Report();
        report.generateReportContent();

        //打印报告
        ReportPrinter reportPrinter = new ReportPrinter();
        reportPrinter.printReport(report);

    }
}
