package com.company.patterns.structural.compozite.kadro;

public class Yazilim extends Sirket {
    public Yazilim(String isim, Bolum departman) {
        super(isim, departman);
    }

    @Override
    public void ekle(Sirket ys) {

    }

    @Override
    public void sil(Sirket ys) {

    }

    @Override
    public void yazdir(int satirbasi) {
        for (int i = 0; i < satirbasi; i++) {
            System.out.println();
            System.out.print("-");
        }
        System.out.println(">Y " + isim + " - " + departman);
    }
}
