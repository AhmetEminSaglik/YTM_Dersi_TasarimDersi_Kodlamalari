package com.company.patterns.behavioral.strateji.benimcozumum.eleman;

import com.company.patterns.behavioral.strateji.benimcozumum.izin.IzinHesap;
import com.company.patterns.behavioral.strateji.benimcozumum.maas.MaasHesapla;

public class Muhendis extends Eleman {
    public Muhendis(MaasHesapla maasHesapla, IzinHesap izinHesapla) {
        super(maasHesapla, izinHesapla);
    }
}
