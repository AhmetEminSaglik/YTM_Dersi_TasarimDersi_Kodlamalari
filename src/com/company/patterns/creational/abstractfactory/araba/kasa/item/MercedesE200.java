package com.company.patterns.creational.abstractfactory.araba.kasa.item;

import com.company.patterns.creational.abstractfactory.araba.lastik.SoyutArabaLastigi;
import com.company.patterns.creational.abstractfactory.araba.kasa.SoyutArabaKasasi;

public class MercedesE200 extends SoyutArabaKasasi {
    @Override
    public void LastikTak(SoyutArabaLastigi lastik) {
        System.out.println(lastik.getClass().getSimpleName() + " lastikli MercedesE200");
    }

   /* @Override
    void kasaUret() {
        System.out.println("Kasa uretildi: MercedesE2000");
    }*/
}
