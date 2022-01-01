package com.company.patterns.structural.compozite.kadro;

public class Main {
    public static void main(String[] args) {
        Kadro kadro = new Kadro("Ahmet", Bolum.Analist);
//        kadro.ekle(kadro);
        kadro.ekle(new Kadro("Zulal", Bolum.Test));
        kadro.ekle(new Kadro("Irem", Bolum.Arge));

        Kadro altKadro= new Kadro("Kerem",Bolum.Junior);
        Kadro testKadro= new Kadro("Zeyd Asaf",Bolum.Test);
        Kadro testKadro2= new Kadro("Gokturk",Bolum.Test);
        altKadro.ekle(testKadro);
        altKadro.ekle(testKadro2);
        kadro.ekle(altKadro);

        /*Sirket sirket = new Yazilim("Nisa", Bolum.Test);
        sirket.ekle(sirket);
        sirket.ekle(new Yazilim("Ahmet Emin", Bolum.Senior));

        sirket.yazdir(1);
*/
        kadro.yazdir(0);

    }
}
