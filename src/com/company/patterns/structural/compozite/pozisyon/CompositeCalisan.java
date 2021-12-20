package com.company.patterns.structural.compozite.pozisyon;

import java.util.ArrayList;
import java.util.List;

public class CompositeCalisan extends Calisan {
    List<Calisan> calisanlarListe;//= new ArrayList<Calisan>();

    public CompositeCalisan(String ad, EnumPozisyon pozisyon) {
        super(ad, pozisyon);
        calisanlarListe = new ArrayList<>();
    }

    public void add(Calisan calisan) {
        calisanlarListe.add(calisan);

    }

    @Override
    public void goster() {
        System.out.println(ad + "'in calisanlari :");//  size :" + calisanlarListe.size()
        for (Calisan tmp : calisanlarListe) {
            System.out.println(tmp.pozisyon + " - " + tmp.ad);
        }
        System.out.println("- - -");

    }
}
