package com.company.patterns.behavioral.observer.gsmoperator;

public class SendFreeCreditObserver implements IObserver {
    @Override
    public void notify(Customer custormer) {
        System.out.println(custormer.telefonNo + " numarasina sahip " +
                custormer.kullaniciAdi + " adli kullaniciya bedava kontor gonderildi ");

    }
}
