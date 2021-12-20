package com.company.patterns.behavioral.observer.urun;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        BigDecimal small = new BigDecimal("10");
//        BigDecimal big = new BigDecimal("20");
//        System.out.println(small.compareTo(big));

        AbsUrun kitap = new Urun("Kitap", new BigDecimal("10.25"));
        kitap.takipList.add(new Uye("ahmeteminsaglik@gmail.com"));
        kitap.takipList.add(new Uye("ceylanKaya@gmail.com"));
        kitap.setFiyat(new BigDecimal("8.99"));
        kitap.setFiyat(new BigDecimal("18.99"));
        kitap.setFiyat(new BigDecimal("15.99"));
        kitap.setFiyat(new BigDecimal("1.99"));

    }
}
