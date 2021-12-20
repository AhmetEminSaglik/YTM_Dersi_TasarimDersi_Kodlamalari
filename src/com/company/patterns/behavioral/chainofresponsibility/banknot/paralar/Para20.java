package com.company.patterns.behavioral.chainofresponsibility.banknot.paralar;

import com.company.patterns.behavioral.chainofresponsibility.banknot.Banknot;
import com.company.patterns.behavioral.chainofresponsibility.banknot.Miktar;

public class Para20 extends Banknot {
    int banknotDegeri = 20;

    @Override
    public Miktar paraCek(int tutar) {
        if (tutar >= banknotDegeri) {
            Miktar miktar = new Miktar();
            miktar.setAdet(tutar / banknotDegeri);
            miktar.setKalan(tutar % banknotDegeri);
            miktar.tutar = banknotDegeri;

            return miktar;
        } else
            return banknot.paraCek(tutar);

    }
}
