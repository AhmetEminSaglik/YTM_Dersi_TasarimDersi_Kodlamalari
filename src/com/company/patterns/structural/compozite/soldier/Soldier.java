package com.company.patterns.structural.compozite.soldier;

import java.util.ArrayList;
import java.util.List;

public abstract class Soldier {
//    List<Soldier> listSoldier;
    protected String name;
    protected Rank rank;


    public Soldier(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
//        listSoldier = new ArrayList<>();
    }

    public abstract void add(Soldier soldier);

    public abstract void removeSoldier(Soldier soldier);

    public abstract void executeOrder() ;

}
