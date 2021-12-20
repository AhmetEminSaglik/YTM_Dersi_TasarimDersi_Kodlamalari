package com.company.patterns.behavioral.strateji.hocanincozumu;


import com.company.patterns.behavioral.strateji.benimcozumum.izin.IzinHesap;
import com.company.patterns.behavioral.strateji.hocanincozumu.maas.MaasHesap;

public class Eleman {
    public IzinHesap izinHesap;
    public MaasHesap maasHesap;

    public Eleman(IzinHesap izinHesap, MaasHesap maasHesap) {
        this.izinHesap = izinHesap;
        this.maasHesap = maasHesap;
    }

    public int izinHesapla() {
        return izinHesap.izinHesapla();
    }

    public int maasHesapla() {
        return maasHesap.maasHesapla();
    }
}
