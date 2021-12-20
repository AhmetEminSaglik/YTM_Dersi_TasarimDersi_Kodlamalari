package com.company.patterns.structural.compozite.worker;

public class Main {
    public static void main(String[] args) {
        CompositeDealers genelMudurluk = new CompositeDealers();

        CompositeDealers icAnadoluBolgesi = new CompositeDealers();
        CompositeDealers ankaraBolgesi = new CompositeDealers();
        CompositeDealers sivasBolgesi = new CompositeDealers();

        CompositeDealers ankara1 = new CompositeDealers();
        CompositeDealers ankara2 = new CompositeDealers();

        CompositeDealers sivas1 = new CompositeDealers();

        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());
        ankara1.add(new WorkingPerson());

        ankara2.add(new WorkingPerson());

        ankaraBolgesi.add(ankara1);
        ankaraBolgesi.add(ankara2);

        sivas1.add(new WorkingPerson());

        sivasBolgesi.add(sivas1);

        icAnadoluBolgesi.add(ankaraBolgesi);
        icAnadoluBolgesi.add(sivasBolgesi);

        genelMudurluk.add(icAnadoluBolgesi);

        System.out.println("---------------------------------------------------");
        System.out.println("Ankara 1  Bayi Maliyet : " + ankara1.getCost());
        System.out.println("Ankara 2  Bayi Maliyet : " + ankara2.getCost());
        System.out.println("Ankara Bolgesi  Bayi Maliyet : " + ankaraBolgesi.getCost());
        System.out.println("---------------------------------------------------");
        System.out.println("Sivas1 Bayi Maliyet : " + sivas1.getCost());
        System.out.println("Sivas1 Bolgesi Maliyet : " + sivasBolgesi.getCost());
        System.out.println("---------------------------------------------------");
        System.out.println("IcAnadolu Mudurlugu Maliyet : " + icAnadoluBolgesi.getCost());
        System.out.println("---------------------------------------------------");
        System.out.println("Toplam Maliyet : " + genelMudurluk.getCost());
        System.out.println("---------------------------------------------------");
    }
}
