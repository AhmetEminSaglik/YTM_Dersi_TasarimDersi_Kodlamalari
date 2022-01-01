package com.company.patterns.structural.bridge.kargo;

public class KargoGonder {
    public IKargo iKargo;
    public String gonderen, alici;

    public void gonder() {
        iKargo.kargoGonder(gonderen, alici);
    }
}
