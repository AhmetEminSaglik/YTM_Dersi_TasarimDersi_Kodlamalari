package com.company.patterns.behavioral.observer.urun;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class AbsUrun {
    public String urunAdi;
    private BigDecimal fiyat;
    public List<IUye> takipList = new ArrayList<IUye>();

    public AbsUrun(String urunAdi, BigDecimal fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public BigDecimal getFiyat() {
        return fiyat;
    }

    public void setFiyat(BigDecimal fiyat) {
        if (fiyat.compareTo(this.fiyat) < 0) {
            System.out.println("if 1 geldi fiyat : " + fiyat + " this.fiyat : " + this.fiyat);
            this.fiyat = fiyat;
            notifyUrun();
//       } else {
            this.fiyat = fiyat;
        }
    }

    public void notifyUrun() {
        System.out.println("Notify Urun : ");
        for (IUye item : takipList) {
            item.update(this);
        }
    }
}
