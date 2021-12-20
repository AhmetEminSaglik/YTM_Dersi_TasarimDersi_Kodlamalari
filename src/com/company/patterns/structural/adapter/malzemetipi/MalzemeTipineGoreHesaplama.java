package com.company.patterns.structural.adapter.malzemetipi;

import com.company.patterns.structural.adapter.interfaces.ITutarHesaplayici;

public class MalzemeTipineGoreHesaplama implements ITutarHesaplayici {

    @Override
    public double hesapla(double fiyat, double adet) {
        System.out.println("Malzeme tipine gore hesaplama");
        return fiyat * adet;
    }
}
