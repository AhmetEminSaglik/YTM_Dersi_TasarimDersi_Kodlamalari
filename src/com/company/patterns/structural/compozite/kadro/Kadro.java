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
        liste.add(ys);

    }

    @Override
    public void sil(Sirket ys) {
        liste.remove(ys);

    }

    @Override
    public void yazdir(int satirbasi) {
        System.out.println("> " + isim + " - " + departman);

        for (int i = 0; i < liste.size(); i++) {
            System.out.println(liste.get(i).isim + " " + liste.get(i).departman);

            for (int j = 0; j < satirbasi; j++) {
                System.out.println();
                System.out.print("-");

            }
        }
//        System.out.println("AAAAA");


    }
}
