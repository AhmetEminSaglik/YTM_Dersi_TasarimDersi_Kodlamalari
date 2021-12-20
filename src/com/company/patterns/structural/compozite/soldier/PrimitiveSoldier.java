package com.company.patterns.structural.compozite.soldier;



public class PrimitiveSoldier extends Soldier { //leaf olarak belledik bunu
    public PrimitiveSoldier(String name, Rank rank) {
        super(name, rank);
    }

    @Override
    public void add(Soldier soldier) {
        System.out.println("Not implemented");
    }

    @Override
    public void removeSoldier(Soldier soldier) {
        listSoldier.remove(soldier);
    }

    @Override
    public void executeOrder() {
        System.out.println(rank + " " + name + " is ready to obey the order (Primitive/Leaf)");
    }






/*public PrimitiveSoldier() {
        listSoldier = new ArrayList<>();
    }

    public void add(Soldier soldier) {
        listSoldier.add(soldier);
    }

    public void removeSoldier(Soldier soldier) {
        listSoldier.remove(soldier);
    }*/


}
