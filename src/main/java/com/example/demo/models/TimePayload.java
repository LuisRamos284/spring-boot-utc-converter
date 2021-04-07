package com.example.demo.models;

public class TimePayload {

    String hour;
    int diff;


    public TimePayload() {
    }

    public TimePayload(String hour, int diff) {
        this.hour = hour;
        this.diff = diff;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int diff) {
        this.diff = diff;
    }
}
