package com.company.patterns.creational.abstractfactory.araba.fabrika.item;

import com.company.patterns.creational.abstractfactory.araba.fabrika.SoyutArabaFabrikasi;
import com.company.patterns.creational.abstractfactory.araba.kasa.item.MercedesE200;
import com.company.patterns.creational.abstractfactory.araba.kasa.SoyutArabaKasasi;
import com.company.patterns.creational.abstractfactory.araba.lastik.item.MercedesLastik;
import com.company.patterns.creational.abstractfactory.araba.lastik.SoyutArabaLastigi;

public class MercedesFabrikasi extends SoyutArabaFabrikasi {

    @Override
    public SoyutArabaKasasi kasaUret() {
        return new MercedesE200();
    }

    @Override
    public SoyutArabaLastigi lastikUret() {
        return new MercedesLastik();
    }
}
