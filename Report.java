package corejava;

public class Report {
    String reportType;
    String deptGroup;

    Report() {
    }

    Report(String reportType, String deptGroup) {
        this.reportType = reportType;
        this.deptGroup = deptGroup;
    }

    public void DisplayReport() {
        System.out.println("Report loading....");
    }
}
