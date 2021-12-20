package com.company.patterns.structural.compozite.pozisyon;

public class LeafCalisan extends Calisan {
    public LeafCalisan(String ad, EnumPozisyon pozisyon) {
        super(ad, pozisyon);
    }

    @Override
    public void goster() {
        System.out.println(" " + this.pozisyon.toString() + " " + this.ad );//+ " // " + getClass().getSimpleName());
    }
}
