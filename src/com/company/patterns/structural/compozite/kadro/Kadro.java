package com.company.patterns.structural.compozite.kadro;

import java.util.ArrayList;
import java.util.List;

public class Kadro extends Sirket {
    private List<Sirket> liste = new ArrayList<>();

    public Kadro(String isim, Bolum departman) {
        super(isim, departman);
    }

    @Override
    public void ekle(Sirket ys) {
        System.out.println("GELDII+");
        liste.add(ys);

    }

    @Override
    public void sil(Sirket ys) {
        liste.remove(ys);

    }

    @Override
    public void yazdir(int satirbasi) {
        for (int i = 0; i < satirbasi; i++) {
            System.out.println();
            System.out.print("-");
        }
        System.out.println("> " + isim + " - " + departman);

        for (Sirket u : liste) {
            u.yazdir(satirbasi + 2);
        }

    }
}
