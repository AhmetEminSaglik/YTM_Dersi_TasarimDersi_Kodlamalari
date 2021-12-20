package com.company.patterns.structural.compozite.pozisyon;

public class Main {
    public static void main(String[] args) {
        CompositeCalisan genelMudur = new CompositeCalisan("Ahmet", EnumPozisyon.GenelMudur);

        CompositeCalisan mudur = new CompositeCalisan("Omer Netbeans", EnumPozisyon.Mudur);
        genelMudur.add(mudur);


        CompositeCalisan departmanSorumlusu = new CompositeCalisan("Apo", EnumPozisyon.DepartmanSorumlusu);
        mudur.add(departmanSorumlusu);

        mudur.add(new LeafCalisan("Eren", EnumPozisyon.Isci));

        LeafCalisan leafCalisan = new LeafCalisan("Omer Ktu", EnumPozisyon.Isci);
        departmanSorumlusu.add(leafCalisan);

        genelMudur.goster();
        mudur.goster();
        departmanSorumlusu.goster();

//        genelMudur.add(mudur);

//leafCalisan.goster();
    }

}
