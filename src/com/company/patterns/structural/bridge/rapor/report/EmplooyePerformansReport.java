package com.company.patterns.structural.bridge.rapor.report;

import com.company.patterns.structural.bridge.rapor.IReportFormat;

public class EmplooyePerformansReport extends Report {
    public EmplooyePerformansReport(IReportFormat reportFormat) {
        super(reportFormat);
    }

    @Override
    public void display() {
        System.out.println("- - - - - - - Calisan Performans Raporu - - - - - - - ");
        super.display();
    }
}
