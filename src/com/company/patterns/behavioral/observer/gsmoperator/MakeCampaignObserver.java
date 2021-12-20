package com.company.patterns.behavioral.observer.gsmoperator;

public class MakeCampaignObserver implements IObserver {
    @Override
    public void notify(Customer custormer) {
        System.out.println(custormer.telefonNo + " numarasina sahip " +
                custormer.kullaniciAdi + " adli kullaniciya mesaj gonderildi ");
    }

}
