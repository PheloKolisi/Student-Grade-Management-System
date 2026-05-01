interface ReportCreator {
    Report createReport();
}

class StudentReportCreator implements ReportCreator {
    public Report createReport() {
        return new Report("R1");
    }
}
