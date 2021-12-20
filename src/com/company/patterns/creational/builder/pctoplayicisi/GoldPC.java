package com.company.patterns.creational.builder.pctoplayicisi;

import com.company.patterns.creational.builder.Bilgisayar;

public class GoldPC implements IBilgisayarToplaycisi {

    private Bilgisayar gBilgisayar;

    public GoldPC() {
        gBilgisayar = new Bilgisayar("GOLD-PC");
    }

    @Override
    public Bilgisayar getbilgisayar() {
        return gBilgisayar;
    }

    @Override
    public void CDROM_Olustur() {
        gBilgisayar.setParca("cdrom", "52X GoldStar");
    }

    @Override
    public void HDD_Olustur() {
        gBilgisayar.setParca("hdd", "60 GB  Seagate");
    }

    @Override
    public void Monitor_Olustur() {
        gBilgisayar.setParca("monitor", "17' HyundaiFactory");
    }

    @Override
    public void RAM_Olustur() {
        gBilgisayar.setParca("ram", "512 MB DDR  Kingston");
    }
}
