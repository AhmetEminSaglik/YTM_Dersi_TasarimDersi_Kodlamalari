package com.company.patterns.behavioral.observer.weather.interfaces;

import com.company.patterns.behavioral.observer.weather.interfaces.Observer;

public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
