package com.company.patterns.structural.adapter.business;

import com.company.patterns.structural.adapter.adapterpart.Adapter;
import com.company.patterns.structural.adapter.malzemetipi.MalzemeTipineGoreHesaplama;

public class Main {

    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        String tercih = "";
        Client client = new Client();
        try {
            while (true) {
                client.odenecekMeblaHesapla(new Adapter());
                client.odenecekMeblaHesapla(new MalzemeTipineGoreHesaplama());
            }
        } catch (Exception e) {
            System.out.println("program sonlanacaktir");
        }
    }

}
