package com.company.patterns.structural.bridge.kargo;

public class AnlasmaliKargoGonderimi extends KargoGonder {
    @Override
    public void gonder() {
        System.out.println("Anlasmali Kargo Gonderimi");
        iKargo.kargoGonder(gonderen, alici);
    }
}
