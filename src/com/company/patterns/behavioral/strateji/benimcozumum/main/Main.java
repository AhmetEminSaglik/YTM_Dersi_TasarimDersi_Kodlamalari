package com.company.patterns.behavioral.strateji.benimcozumum.main;

import com.company.patterns.behavioral.strateji.benimcozumum.eleman.Eleman;
import com.company.patterns.behavioral.strateji.benimcozumum.eleman.Muhendis;
import com.company.patterns.behavioral.strateji.benimcozumum.eleman.Teknisyen;
import com.company.patterns.behavioral.strateji.benimcozumum.eleman.Yonetici;
import com.company.patterns.behavioral.strateji.benimcozumum.izin.ADepartmaniIzni;
import com.company.patterns.behavioral.strateji.benimcozumum.izin.BDepartmaniIzni;
import com.company.patterns.behavioral.strateji.benimcozumum.maas.MuhendisMaas;
import com.company.patterns.behavioral.strateji.benimcozumum.maas.TeknisyenMaas;
import com.company.patterns.behavioral.strateji.benimcozumum.maas.YoneticiMaas;

public class Main {
    public static void main(String[] args) {
        Eleman yonetici = new Yonetici(new YoneticiMaas(), new ADepartmaniIzni());
        Eleman muhendis = new Muhendis(new MuhendisMaas(), new ADepartmaniIzni());
        Eleman teknisyen = new Teknisyen(new TeknisyenMaas(), new BDepartmaniIzni());
        System.out.println(yonetici);
//        System.out.println(yonetici.maasHesapla());
        System.out.println(muhendis);
        System.out.println(teknisyen);
    }
}
