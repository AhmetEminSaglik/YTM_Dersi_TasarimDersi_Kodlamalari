package com.company.patterns.creational.singleton;

public class Singleton {
    private String name = "";
    private static Singleton singleton = new Singleton();

    private Singleton() {
    }


    public static Singleton getObject() {
        return singleton;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
