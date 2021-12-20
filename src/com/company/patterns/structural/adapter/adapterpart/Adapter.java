package com.company.patterns.structural.adapter.adapterpart;

import com.company.patterns.structural.adapter.interfaces.ITutarHesaplayici;

public class Adapter implements ITutarHesaplayici {
    private  Adaptee adaptee;

    public Adapter() {
        adaptee = new Adaptee();
    }

    @Override
    public double hesapla(double fiyat, double adet) {
        System.out.println("Adapter Fiyati  : (Iskontolu)");
        return adaptee.IskontaliTutariHesapla(fiyat,adet);
    }
}
