package com.company.patterns.creational.builder;

import java.util.Hashtable;

public class Bilgisayar {
    private String mBilgisayarTipi;
    private Hashtable parcalar = new Hashtable();


    public Bilgisayar(String BilgisayarTipi) {
        this.mBilgisayarTipi = BilgisayarTipi;
    }

    public Object getParca(String key) {
        return parcalar.get(key);
    }

    public void setParca(String key, String value) {
        parcalar.put(key, value);
    }

    public void bilgisayariGoster() {
        System.out.println("Bilgisayar Tipi : " + mBilgisayarTipi);
        System.out.println("--> CD-ROM Model : " + parcalar.get("cdrom"));
        System.out.println("--> Hard Disk Model : " + parcalar.get("hdd"));
        System.out.println("--> Monitor Model : " + parcalar.get("monitor"));
        System.out.println("--> Ram Model : " + parcalar.get("ram"));

    }

}
