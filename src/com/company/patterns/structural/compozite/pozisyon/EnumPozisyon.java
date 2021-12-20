package com.company.patterns.structural.compozite.pozisyon;

public enum EnumPozisyon {
    GenelMudur(1), Mudur(2), DepartmanSorumlusu(3), Isci(4);
    int pozisyon;

    EnumPozisyon(int pozisyon) {
        this.pozisyon = pozisyon;
    }
}
