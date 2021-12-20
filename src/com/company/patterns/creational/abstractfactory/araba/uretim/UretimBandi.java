package com.company.patterns.creational.abstractfactory.araba.uretim;

import com.company.patterns.creational.abstractfactory.araba.FabrikaOtomasyon;
import com.company.patterns.creational.abstractfactory.araba.fabrika.SoyutArabaFabrikasi;
import com.company.patterns.creational.abstractfactory.araba.fabrika.item.FordFabrikasi;
import com.company.patterns.creational.abstractfactory.araba.fabrika.item.MercedesFabrikasi;

public class UretimBandi {
    public static void main(String[] args) {
        SoyutArabaFabrikasi fabrika1 = new MercedesFabrikasi();
        FabrikaOtomasyon fo1 = new FabrikaOtomasyon(fabrika1);
        fo1.LastikTak();

        SoyutArabaFabrikasi fabrika2 = new FordFabrikasi();
        FabrikaOtomasyon fo2= new FabrikaOtomasyon(fabrika2);
        fo2.LastikTak();
    }
}
