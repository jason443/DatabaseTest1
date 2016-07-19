package com.databasetest1;

import android.widget.Toast;

/**
 * Created by ASUS on 2016/7/19.
 */
public class Result {

    private Sk sk;
    private Today today;
    private String wind;
    private String dressing_index;
    private String dressing_advice;
    private String uv_index;
    private String comfort_index;
    private String wash_index;
    private String travel_index;
    private String exercise_index;
    private String drying_index;

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getWind() {
        return wind;
    }

    public Sk getSk() {
        return sk;
    }

    public String getDressing_advice() {
        return dressing_advice;
    }

    public String getDressing_index() {
        return dressing_index;
    }

    public String getUv_index() {
        return uv_index;
    }

    public Today getToday() {
        return today;
    }

    public void setDressing_advice(String dressing_advice) {
        this.dressing_advice = dressing_advice;
    }

    public void setSk(Sk sk) {
        this.sk = sk;
    }

    public void setDressing_index(String dressing_index) {
        this.dressing_index = dressing_index;
    }

    public String getComfort_index() {
        return comfort_index;
    }

    public void setToday(Today today) {
        this.today = today;
    }

    public void setComfort_index(String comfort_index) {
        this.comfort_index = comfort_index;
    }

    public void setUv_index(String uv_index) {
        this.uv_index = uv_index;
    }

    public String getDrying_index() {
        return drying_index;
    }

    public String getExercise_index() {
        return exercise_index;
    }

    public String getTravel_index() {
        return travel_index;
    }

    public String getWash_index() {
        return wash_index;
    }

    public void setDrying_index(String drying_index) {
        this.drying_index = drying_index;
    }

    public void setExercise_index(String exercise_index) {
        this.exercise_index = exercise_index;
    }

    public void setTravel_index(String travel_index) {
        this.travel_index = travel_index;
    }

    public void setWash_index(String wash_index) {
        this.wash_index = wash_index;
    }
}
