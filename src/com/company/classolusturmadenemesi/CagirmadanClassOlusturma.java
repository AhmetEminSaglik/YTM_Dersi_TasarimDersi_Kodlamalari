package com.company.classolusturmadenemesi;

public class CagirmadanClassOlusturma {
    String name;

    public CagirmadanClassOlusturma(String name) {
        this.name = name;
        System.out.println("Class olusturuldu name : " + name);
    }

    @Override
    public String toString() {
        return "CagirmadanClassOlusturma{" +
                "name='" + name + '\'' +
                '}';
    }
}
