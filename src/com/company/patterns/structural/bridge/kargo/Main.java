package com.company.patterns.structural.bridge.kargo;

public class Main {
    public static void main(String[] args) {
         KargoGonder kargoGonder= new KargoGonder();

        kargoGonder.alici="XX";
        kargoGonder.gonderen="YY";
        System.out.println("Gonderen : "+kargoGonder.gonderen+" Alici : "+kargoGonder.alici);
        kargoGonder.kargo= new KarsiOdemeliGonderim();

        kargoGonder.gonder();
    }
}
