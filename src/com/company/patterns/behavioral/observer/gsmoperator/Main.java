package com.company.patterns.behavioral.observer.gsmoperator;

public class Main {
    public static void main(String[] args) {
        Customer custormer = new Customer("0535 707 54 38", "Ahmet Emin SAGLIK");
        custormer.yeniGozlemciEkle(new MakeCampaignObserver());
        custormer.yeniGozlemciEkle(new SendFreeCreditObserver());
        try {
            Thread.sleep(5_000);
            custormer.kontorYukle();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
