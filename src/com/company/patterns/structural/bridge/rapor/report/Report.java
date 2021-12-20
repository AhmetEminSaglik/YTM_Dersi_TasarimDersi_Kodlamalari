package com.company.patterns.structural.bridge.rapor.report;

import com.company.patterns.structural.bridge.rapor.IReportFormat;

public abstract class Report {
    public IReportFormat reportFormat;

    public Report(IReportFormat reportFormat) {
        this.reportFormat = reportFormat;
    }

    public void display() {
        reportFormat.generate();

    }
}
