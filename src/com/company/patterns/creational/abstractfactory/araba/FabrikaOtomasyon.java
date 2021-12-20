package com.company.patterns.creational.abstractfactory.araba;

import com.company.patterns.creational.abstractfactory.araba.fabrika.SoyutArabaFabrikasi;
import com.company.patterns.creational.abstractfactory.araba.kasa.SoyutArabaKasasi;
import com.company.patterns.creational.abstractfactory.araba.lastik.SoyutArabaLastigi;

public class FabrikaOtomasyon {
    private SoyutArabaKasasi arabaKasasi;
    private SoyutArabaLastigi arabaLastigi;

    public FabrikaOtomasyon(SoyutArabaFabrikasi fabrika) {
        arabaKasasi = fabrika.kasaUret();
        arabaLastigi = fabrika.lastikUret();
    }

    public void LastikTak() {
        arabaKasasi.LastikTak(arabaLastigi);
    }

}
