package com.databasetest1;

/**
 * Created by ASUS on 2016/7/19.
 */
public class Sk {

    private String temp;
    private String wind_direction;
    private String wind_strength;
    private String humidity;
    private String time;

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public void setWind_strength(String wind_strength) {
        this.wind_strength = wind_strength;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getTemp() {
        return temp;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public String getTime() {
        return time;
    }

    public String getWind_strength() {
        return wind_strength;
    }
}
