package com.company.patterns.behavioral.chainofresponsibility.banknot;

public abstract class Banknot {
    protected Banknot banknot;

    public void sonraki(Banknot hesap) {
        this.banknot = hesap;
    }

    public abstract Miktar paraCek(int tutar);
}
