package com.company.patterns.behavioral.observer.gsmoperator;

import java.time.LocalDateTime;
import java.util.*;

public class Customer {
    String telefonNo;
    String kullaniciAdi;
    private TimerTask timerTask;
    private Timer timer;
    public List<IObserver> observerList;
    public LocalDateTime sonKontorYuklemeTarihi;

    public Customer(String telefonNo, String kullaniciAdi) {
        this.telefonNo = telefonNo;
        sonKontorYuklemeTarihi = LocalDateTime.now();
        this.kullaniciAdi = kullaniciAdi;
        observerList = new ArrayList<>();

        timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Timer task calisiyor");
            }
        };
        timer = new Timer();
        long delay = 1_000;
        timer.schedule(timerTask, delay);
//timerElapsed();
    }

    public void yeniGozlemciEkle(IObserver observer) {
        if (!observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    void timerElapsed(Object sender) {
        if (LocalDateTime.now().getSecond() - sonKontorYuklemeTarihi.getSecond() > 5) {
            kontorYukle();

        }
//        if (ChronoUnit.SECONDS.between(sonKontorYuklemeTarihi, LocalDateTime.now())){}
    }

    public void observerlaraHaberVer() {
        for (IObserver observer : observerList) {
            observer.notify(this);
        }
    }

    public void kontorYukle() {
        sonKontorYuklemeTarihi = LocalDateTime.now();
    }

}
