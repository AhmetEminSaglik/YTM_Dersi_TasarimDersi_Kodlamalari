package com.company.patterns.behavioral.strateji.benimcozumum.eleman;

import com.company.patterns.behavioral.strateji.benimcozumum.izin.IzinHesap;
import com.company.patterns.behavioral.strateji.benimcozumum.maas.MaasHesapla;

public abstract class Eleman {
    MaasHesapla maasHesapla;
    IzinHesap izinHesapla;

    public Eleman(MaasHesapla maasHesapla, IzinHesap izinHesapla) {
        this.maasHesapla = maasHesapla;
        this.izinHesapla = izinHesapla;
    }

    public double maasHesapla() {
        return maasHesapla.maasHesapla();
    }


    public int izinHesapla() {
        return izinHesapla.izinHesapla();
    }


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "Aylik maas =" + maasHesapla() +
                ", Yillik izin Sayisi=" + izinHesapla() +
                '}';
    }
}
