package com.company.patterns.structural.bridge.kargo;

public class KargoGonder {
    public IKargo kargo;
    public String gonderen, alici;

    public void gonder() {
        kargo.kargoGonder(gonderen, alici);
    }
}
