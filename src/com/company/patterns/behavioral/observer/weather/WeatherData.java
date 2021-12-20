package com.company.patterns.behavioral.observer.weather;

import com.company.patterns.behavioral.observer.weather.interfaces.Observer;
import com.company.patterns.behavioral.observer.weather.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList();

    }

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observerList.indexOf(observer);
        if (i > 0) {
            observerList.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        System.out.println("- - - - - - - -");
        for (int i = 0; i < observerList.size(); i++) {
            Observer observer = observerList.get(i);
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
