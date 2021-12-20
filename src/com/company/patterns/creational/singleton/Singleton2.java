package com.company.patterns.creational.singleton;

public class Singleton2 {
    private static Singleton2 nesne;

    private Singleton2() {
    }

    public static Singleton2 Nesne() {
        if (nesne == null)
            nesne = new Singleton2();
        return nesne;
    }
}
