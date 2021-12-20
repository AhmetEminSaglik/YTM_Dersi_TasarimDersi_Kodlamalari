package com.company.patterns.structural.bridge.rapor.format;

import com.company.patterns.structural.bridge.rapor.IReportFormat;

public class DesktopFormat implements IReportFormat {
    @Override
    public void generate() {
        System.out.println("Rapor Desktop Formatinda olusturuldu");
    }
}
