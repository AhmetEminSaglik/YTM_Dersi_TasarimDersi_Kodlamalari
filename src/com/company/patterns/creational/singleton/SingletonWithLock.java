package com.company.patterns.creational.singleton;

public class SingletonWithLock {
    private static SingletonWithLock nesne;

    private SingletonWithLock() {
        System.out.println("constructor olusturuldu");
    }

    public synchronized static SingletonWithLock getObject() {
        if (nesne == null)
            nesne = new SingletonWithLock();
//            lock()
        return nesne;
    }
}
