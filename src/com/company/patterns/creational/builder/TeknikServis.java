package com.company.patterns.creational.builder;

import com.company.patterns.creational.builder.pctoplayicisi.IBilgisayarToplaycisi;

public class TeknikServis {
    public void bilgisayarTopla(IBilgisayarToplaycisi bilgisayarToplaycisi) {
        bilgisayarToplaycisi.CDROM_Olustur();
        bilgisayarToplaycisi.HDD_Olustur();
        bilgisayarToplaycisi.Monitor_Olustur();
        bilgisayarToplaycisi.RAM_Olustur();
    }
}
