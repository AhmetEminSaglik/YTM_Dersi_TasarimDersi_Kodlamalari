package com.company.patterns.creational.builder.pctoplayicisi;

import com.company.patterns.creational.builder.Bilgisayar;

public class SilverPC implements IBilgisayarToplaycisi {
    private Bilgisayar sBilgisayar;

    public SilverPC() {
        sBilgisayar = new Bilgisayar("Silver-PC");
    }

    @Override
    public Bilgisayar getbilgisayar() {
        return sBilgisayar;
    }

    @Override
    public void CDROM_Olustur() {
        sBilgisayar.setParca("cdrom", "48X Creative");
    }

    @Override
    public void HDD_Olustur() {
        sBilgisayar.setParca("hdd", "30 GB Maxtor");

    }

    @Override
    public void Monitor_Olustur() {
        sBilgisayar.setParca("monitor", "15' Vestel");
    }

    @Override
    public void RAM_Olustur() {
        sBilgisayar.setParca("ram", "256 MB SD Kingston");

    }
}
