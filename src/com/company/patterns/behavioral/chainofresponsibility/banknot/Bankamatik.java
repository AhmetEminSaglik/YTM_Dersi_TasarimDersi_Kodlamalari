package com.company.patterns.behavioral.chainofresponsibility.banknot;

import com.company.patterns.behavioral.chainofresponsibility.banknot.paralar.*;

import java.util.ArrayList;
import java.util.List;

public class Bankamatik {
    Para200 para200 = new Para200();
    Para100 para100 = new Para100();
    Para50 para50 = new Para50();
    Para20 para20 = new Para20();
    Para10 para10 = new Para10();
    Para5 para5 = new Para5();

    public List<Miktar> paracek(int tutar) {
        System.out.println("Toplam tutar : " + tutar);
        para200.sonraki(para100);
        para100.sonraki(para50);
        para50.sonraki(para20);
        para20.sonraki(para10);
        para10.sonraki(para5);
        Miktar miktar = new Miktar();
        miktar.setKalan(tutar);
        List<Miktar> sonuclar = new ArrayList<>();
        System.out.println("While oncesi kalan : " +miktar.getKalan());
        while (miktar.getKalan() > 0) {
            sonuclar.add(miktar = para200.paraCek(tutar));
            tutar = miktar.getKalan();
        }

        for (Miktar tmp : sonuclar) {
            System.out.println("Tutar : " + tmp.tutar + "\tAdet " + tmp.adet);
        }
        return null;
    }
}
