package com.company.patterns.structural.facede.first_systemcontrol;

public class Facede {
    // constructor da olabilir
    // Singleton da olabilir
    TcKimlikSistem tcKimlikSistem = new TcKimlikSistem();
    Sistem1Kontrol sistem1Kontrol = new Sistem1Kontrol();
    Sistem2Operation sistem2Operation = new Sistem2Operation();

    public void sistem2UyeEkle(String tc) {
        if (tcKimlikSistem.kontrol(tc) && !sistem1Kontrol.karalisteKontrol(tc)) {
            sistem2Operation.uyeEkle(tc);
        }
    }
}
