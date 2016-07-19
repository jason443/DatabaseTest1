package com.databasetest1;

/**
 * Created by ASUS on 2016/7/19.
 */
public class Future1 {

    private String temperature;
    private String weather;
    private Weather_id weather_id;
    private String wind;
    private String week;
    private String date;

    public Weather_id getWeather_id() {
        return weather_id;
    }

    public void setWeather_id(Weather_id weather_id) {
        this.weather_id = weather_id;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getDate() {
        return date;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getWeather() {
        return weather;
    }

    public String getWeek() {
        return week;
    }

    public String getWind() {
        return wind;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
