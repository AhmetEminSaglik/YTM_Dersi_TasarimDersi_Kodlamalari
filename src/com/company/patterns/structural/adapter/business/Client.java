package com.company.patterns.structural.adapter.business;

import com.company.patterns.structural.adapter.interfaces.ITutarHesaplayici;

import java.util.Scanner;

public class Client {
    Scanner scanner = new Scanner(System.in);

    public void odenecekMeblaHesapla(ITutarHesaplayici iTutarHesaplayici) {

        System.out.println("Lutfen fiyati giriniz");
        double fiyat = scanner.nextDouble();
        System.out.println("Lutfen miktari giriniz");
        double miktar = scanner.nextDouble();
        System.out.println("Tutar = " + iTutarHesaplayici.hesapla(fiyat, miktar));
    }
}
