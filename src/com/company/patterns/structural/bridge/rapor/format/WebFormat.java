package com.company.patterns.structural.bridge.rapor.format;

import com.company.patterns.structural.bridge.rapor.IReportFormat;

public class WebFormat implements IReportFormat {
    @Override
    public void generate() {
        System.out.println("Rapor Web Formatinda Olusturuldu");
    }
}
