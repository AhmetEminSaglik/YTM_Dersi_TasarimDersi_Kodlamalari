package com.company.patterns.structural.bridge.rapor;

import com.company.patterns.structural.bridge.rapor.format.DesktopFormat;
import com.company.patterns.structural.bridge.rapor.format.WebFormat;
import com.company.patterns.structural.bridge.rapor.report.EmplooyePerformansReport;
import com.company.patterns.structural.bridge.rapor.report.Report;
import com.company.patterns.structural.bridge.rapor.report.SalesReport;

public class Main {
    public static void main(String[] args) {
        Report report = new EmplooyePerformansReport(new DesktopFormat());
        report.display();
        System.out.println();
        Report report2 = new SalesReport(new WebFormat());
        report2.display();
    }
}
