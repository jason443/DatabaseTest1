package com.databasetest1;

/**
 * Created by ASUS on 2016/7/19.
 */
public class Today {

    private String city;
    private String date_y;
    private String week;
    private String temperature;
    private String weather;
    private Weather_id weather_id;

    public String getCity() {
        return city;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getDate_y() {
        return date_y;
    }

    public String getWeather() {
        return weather;
    }

    public String getWeek() {
        return week;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDate_y(String date_y) {
        this.date_y = date_y;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public void setWeather_id(Weather_id weather_id) {
        this.weather_id = weather_id;
    }

    public Weather_id getWeather_id() {
        return weather_id;
    }
}
