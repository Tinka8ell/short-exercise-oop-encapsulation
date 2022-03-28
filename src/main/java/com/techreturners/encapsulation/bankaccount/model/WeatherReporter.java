package com.techreturners.encapsulation.bankaccount.model;

import java.text.MessageFormat;

public class WeatherReporter {

    private final String location;
    private double centigrade;

    public WeatherReporter(String location, double centigrade) {
        this.location = location;
        this.centigrade = centigrade;
    }

    public String getLocation() {
        return location;
    }

    public double getCentigrade() {
        return centigrade;
    }

    public void updateCentigrade(double centigrade) {
        this.centigrade = centigrade;
    }

    public String print() {
        return MessageFormat.format("I am in {0} and it is {1}. {2}. The temperature in Fahrenheit is {3}.",
                location,
                getWeatherIcon(),
                feelsLike(),
                getFahrenheit());
    }

    private double getFahrenheit() {
        return (9.0 / 5.0) * centigrade + 32;
    }

    private String getWeatherIcon() {
        return switch (location) {
            case "London" -> "🌦";
            case "California" -> "🌅";
            case "Cape Town" -> "🌤";
            default -> "🔆";
        };
    }

    private String feelsLike() {
        String feeling = "Ahhh...it's just right 😊!";
        if (centigrade > 30)
            feeling ="It's too hot 🥵!";
        else if (centigrade < 10)
            feeling = "It's too cold 🥶!";
        return feeling;
    }

}
