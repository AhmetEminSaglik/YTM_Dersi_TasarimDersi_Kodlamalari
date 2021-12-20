package com.company.patterns.behavioral.observer.weather.interfaces;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
