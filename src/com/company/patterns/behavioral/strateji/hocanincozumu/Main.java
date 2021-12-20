package com.company.patterns.behavioral.strateji.hocanincozumu;

import com.company.patterns.behavioral.strateji.hocanincozumu.izin.DeparmanAIzinHesap;
import com.company.patterns.behavioral.strateji.hocanincozumu.izin.DepartmanBIzinHesap;
import com.company.patterns.behavioral.strateji.hocanincozumu.maas.MuhendisMaasHesap;
import com.company.patterns.behavioral.strateji.hocanincozumu.maas.TeknisyenMaasHesap;
import com.company.patterns.behavioral.strateji.hocanincozumu.maas.YoneticiMaasHesap;

public class Main {
    public static void main(String[] args) {
        Eleman eleman = new Eleman(new DeparmanAIzinHesap(), new YoneticiMaasHesap());
        int yoneticiMaas = eleman.maasHesapla();
        int yoneticiIzin = eleman.izinHesapla();
         eleman = new Eleman(new DepartmanBIzinHesap(), new MuhendisMaasHesap());
        int muhendisMaas = eleman.maasHesapla();
        int muhendisIzin = eleman.izinHesapla();
         eleman = new Eleman(new DepartmanBIzinHesap(), new TeknisyenMaasHesap());
        int teknisyenMaas = eleman.maasHesapla();
        int teknisyenIzin = eleman.izinHesapla();

        System.out.println("Yonetici maasi:"+yoneticiMaas+" Yonetici Izini: " +yoneticiIzin);
        System.out.println("Muhendis maasi:"+muhendisMaas+" Muhendis Izini: " + muhendisIzin);
        System.out.println("Teknisyen maasi:"+teknisyenMaas+" Teknisyen Izini: " +teknisyenIzin);

    }
}
