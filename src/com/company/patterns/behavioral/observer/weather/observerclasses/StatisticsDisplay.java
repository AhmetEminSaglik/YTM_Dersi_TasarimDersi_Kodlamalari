package com.company.patterns.behavioral.observer.weather.observerclasses;

import com.company.patterns.behavioral.observer.weather.WeatherData;
import com.company.patterns.behavioral.observer.weather.interfaces.DisplayElement;
import com.company.patterns.behavioral.observer.weather.interfaces.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {

    private float maxTemp = 0.0f;
    private float minTemp = 200;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        tempSum += temp;
        numReadings++;
        if (temp > maxTemp)
            maxTemp = temp;
        if (temp < minTemp)
            minTemp = temp;
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)+"/"+maxTemp+"/"+minTemp);
    }


}
