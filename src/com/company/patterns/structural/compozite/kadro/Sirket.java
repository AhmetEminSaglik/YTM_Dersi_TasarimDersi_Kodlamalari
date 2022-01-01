package com.company.patterns.structural.compozite.kadro;

import java.util.ArrayList;
import java.util.List;

public abstract class Sirket {
    protected String isim;
    protected Bolum departman;
//    List<Sirket> sirketList;

    public Sirket(String isim, Bolum departman) {
        this.isim = isim;
        this.departman = departman;
//        sirketList= new ArrayList<>();
    }

    public abstract void ekle(Sirket ys);

    public abstract void sil(Sirket ys);

    public abstract void yazdir(int satirbasi);
}
