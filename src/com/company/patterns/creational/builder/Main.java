package com.company.patterns.creational.builder;

import com.company.patterns.creational.builder.pctoplayicisi.GoldPC;
import com.company.patterns.creational.builder.pctoplayicisi.IBilgisayarToplaycisi;
import com.company.patterns.creational.builder.pctoplayicisi.SilverPC;

public class Main {
    public static void main(String[] args) {
        TeknikServis teknikServis = new TeknikServis();
        IBilgisayarToplaycisi BT1 = new GoldPC();
        IBilgisayarToplaycisi BT2 = new SilverPC();
        teknikServis.bilgisayarTopla(BT1);
        teknikServis.bilgisayarTopla(BT2);

        BT1.getbilgisayar().bilgisayariGoster();
        System.out.println("============================================");
        BT2.getbilgisayar().bilgisayariGoster();
    }
}
