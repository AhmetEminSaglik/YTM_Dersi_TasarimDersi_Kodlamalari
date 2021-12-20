package com.company.patterns.creational.abstractfactory.araba.kasa.item;

import com.company.patterns.creational.abstractfactory.araba.lastik.SoyutArabaLastigi;
import com.company.patterns.creational.abstractfactory.araba.kasa.SoyutArabaKasasi;

public class FordFocus extends SoyutArabaKasasi {
    @Override
    public void LastikTak(SoyutArabaLastigi lastik) {
        System.out.println(lastik.getClass().getSimpleName() + " lastikli FordFocus");
    }
    /*@Override
    void kasaUret() {
        System.out.println("Kasa uretildi: FordFocus");
    }*/
}
