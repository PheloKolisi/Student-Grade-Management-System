public class Report {
    private String reportId;

    public Report(String reportId) {
        this.reportId = reportId;
    }

    public void generateReport() {
        System.out.println("Report generated: " + reportId);
    }
}
