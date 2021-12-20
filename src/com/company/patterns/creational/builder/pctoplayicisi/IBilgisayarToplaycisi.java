package com.company.patterns.creational.builder.pctoplayicisi;

import com.company.patterns.creational.builder.Bilgisayar;

public interface IBilgisayarToplaycisi {
    Bilgisayar getbilgisayar();

    void CDROM_Olustur();

    void HDD_Olustur();

    void Monitor_Olustur();

    void RAM_Olustur();
}
