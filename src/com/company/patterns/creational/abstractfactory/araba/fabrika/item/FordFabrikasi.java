package com.company.patterns.creational.abstractfactory.araba.fabrika.item;

import com.company.patterns.creational.abstractfactory.araba.fabrika.SoyutArabaFabrikasi;
import com.company.patterns.creational.abstractfactory.araba.kasa.item.FordFocus;
import com.company.patterns.creational.abstractfactory.araba.kasa.SoyutArabaKasasi;
import com.company.patterns.creational.abstractfactory.araba.lastik.item.FordLastik;
import com.company.patterns.creational.abstractfactory.araba.lastik.SoyutArabaLastigi;

public class FordFabrikasi extends SoyutArabaFabrikasi {
    @Override
    public SoyutArabaKasasi kasaUret() {
        return new FordFocus();
    }

    @Override
    public SoyutArabaLastigi lastikUret() {
        return new FordLastik();
    }
}
