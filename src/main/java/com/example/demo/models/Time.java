package com.example.demo.models;

public class Time {

    String time;
    String timezone;

    public Time() {
    }

    public Time(String time) {
        this.time = time;
        this.timezone = "utc";
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
}
