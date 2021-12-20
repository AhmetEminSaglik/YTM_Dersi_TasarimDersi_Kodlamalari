package com.company.patterns.structural.compozite.kadro;

public class Main {
    public static void main(String[] args) {
        Sirket sirket = new Yazilim("Nisa", Bolum.Test);
        sirket.ekle(sirket);
        sirket.ekle(new Yazilim("Ahmet Emin",Bolum.Senior));
        sirket.yazdir(1);


    }
}
