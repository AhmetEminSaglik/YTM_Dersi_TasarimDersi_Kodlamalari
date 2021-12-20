package com.company.patterns.structural.bridge.rapor.report;

import com.company.patterns.structural.bridge.rapor.IReportFormat;

public class SalesReport extends Report {
    public SalesReport(IReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public void display() {
        System.out.println("- - - - - - - Satis Raporu - - - - - - - ");
        super.display();
    }
}
