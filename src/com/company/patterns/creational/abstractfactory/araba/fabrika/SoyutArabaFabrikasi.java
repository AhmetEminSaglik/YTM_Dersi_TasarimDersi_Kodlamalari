package com.company.patterns.creational.abstractfactory.araba.fabrika;

import com.company.patterns.creational.abstractfactory.araba.kasa.SoyutArabaKasasi;
import com.company.patterns.creational.abstractfactory.araba.lastik.SoyutArabaLastigi;

public abstract class SoyutArabaFabrikasi {
    abstract public SoyutArabaKasasi kasaUret();

    abstract public SoyutArabaLastigi lastikUret();

}

