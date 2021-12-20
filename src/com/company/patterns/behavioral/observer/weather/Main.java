package com.company.patterns.behavioral.observer.weather;

import com.company.patterns.behavioral.observer.weather.observerclasses.ForecastDisplay;
import com.company.patterns.behavioral.observer.weather.observerclasses.StatisticsDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.40f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
