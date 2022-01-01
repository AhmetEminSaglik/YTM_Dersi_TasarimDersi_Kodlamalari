package com.company.patterns.structural.compozite.soldier;

import java.util.ArrayList;
import java.util.List;

public class CompositeSoldier extends Soldier {
    /*Composite tip kendi icinde birden fazla Component tipi icerebilir.
    Bu tipleri bir koleksiyon icinde tutabilir.*/
    List<Soldier> listSoldier;

    public CompositeSoldier(String name, Rank rank) {
        super(name, rank);
        listSoldier = new ArrayList<>();
    }

    @Override
    public void add(Soldier soldier) {
//        System.out.println("Eklenecek soldier : "+soldier.rank+" "+soldier.name);
        listSoldier.add(soldier);
    }

    @Override
    public void removeSoldier(Soldier soldier) {
        listSoldier.remove(soldier);

    }

    @Override
    public void executeOrder() {
        System.out.println("> Command : " + rank + " " + name + " Composite");
        for (Soldier tmpSoldier : listSoldier) {
//            System.out.println(tmpSoldier.rank + " " + tmpSoldier.name + " is under command  of  Commander : " + rank + " " + name);
            tmpSoldier.executeOrder();
//            System.out.println("---------");
        }

//            System.out.println(tmpSoldier.rank + " " + tmpSoldier.name + " is ready to obey the order");
    }
/*
    @Override
    public void add(Soldier soldier) {
        *//*Composite tipin altina bir Component eklemek icin kullanilir*//*
        listSoldier.add(soldier);
    }

    @Override
    public void removeSoldier(Soldier soldier) {
        *//*Composite tipin altindaki koleksiyon icerisinden bir Component cikarmak icin kullanilir*//*
        listSoldier.remove(soldier);
    }*/


}
