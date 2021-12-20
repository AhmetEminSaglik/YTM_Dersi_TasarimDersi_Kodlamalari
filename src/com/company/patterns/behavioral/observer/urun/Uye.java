package com.company.patterns.behavioral.observer.urun;

public class Uye implements IUye {
    String email;

    public Uye(String email) {
        this.email = email;
    }

    @Override
    public void update(AbsUrun urun) {
        System.out.println(urun.getUrunAdi() + "'in fiyati "+email+" adresine gonderildi : " + urun.getFiyat() + "  olarak guncellendi");
    }

}
