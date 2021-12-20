package com.company.patterns.structural.adapter.adapterpart;

import java.util.Scanner;

public class Adaptee {
    public double IskontaliTutariHesapla(double fiyat, double adet) {
        System.out.println("Lutfen iskonto miktarini giriniz : ");
        double iskonto = new Scanner(System.in).nextDouble();
        return fiyat * adet * (1 - iskonto);
    }
}
