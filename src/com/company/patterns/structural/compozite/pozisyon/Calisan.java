package com.company.patterns.structural.compozite.pozisyon;

public abstract class Calisan {
    protected String ad;
    protected EnumPozisyon pozisyon;

    public Calisan(String ad, EnumPozisyon pozisyon) {
        this.ad = ad;
        this.pozisyon = pozisyon;
    }

    public abstract void goster();
}
