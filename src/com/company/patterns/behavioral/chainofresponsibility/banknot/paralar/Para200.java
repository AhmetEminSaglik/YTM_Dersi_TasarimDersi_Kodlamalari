package com.company.patterns.behavioral.chainofresponsibility.banknot.paralar;

import com.company.patterns.behavioral.chainofresponsibility.banknot.Banknot;
import com.company.patterns.behavioral.chainofresponsibility.banknot.Miktar;

public class Para200 extends Banknot {
    @Override
    public Miktar paraCek(int tutar) {
        if (tutar >= 200) {
            Miktar miktar = new Miktar();
            miktar.setAdet(tutar / 200);
            miktar.setKalan(tutar % 200);
            miktar.tutar = 200;

            return miktar;
        } else
            return banknot.paraCek(tutar);
    }
}
