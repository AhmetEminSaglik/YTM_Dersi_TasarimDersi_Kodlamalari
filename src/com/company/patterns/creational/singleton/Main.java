package com.company.patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
//        Singleton singleton = Singleton.getObject();
//
//        singleton.setName("Singleton deneme");
//        System.out.println(singleton.getName());
//        singleton.setName("Singleton deneme 2 ");
//        singleton = Singleton.getObject();
//
//        System.out.println(singleton.getName());


        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonWithLock singleton1 = SingletonWithLock.getObject();

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton2 = Singleton.getObject();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonWithLock singleton1 = SingletonWithLock.getObject();

            }
        });
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton2 = Singleton.getObject();
            }
        });
        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                SingletonWithLock singleton1 = SingletonWithLock.getObject();

            }
        });
        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton2 = Singleton.getObject();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
    }
}
