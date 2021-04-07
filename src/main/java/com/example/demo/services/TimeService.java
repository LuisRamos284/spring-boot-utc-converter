package com.example.demo.services;

import com.example.demo.models.TimePayload;
import com.example.demo.models.Time;
import com.example.demo.models.TimeResponse;
import com.google.gson.Gson;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Service;

import java.text.ParseException;

@Service
public class TimeService extends Throwable {

    Gson gson = new Gson();
    String pattern = "HH:mm:ss";

    public String convertHour(TimePayload timePayload) throws ParseException {

        DateTimeZone dtz = DateTimeZone.forOffsetHours(timePayload.getDiff());

        DateTimeFormatter formatter = DateTimeFormat.forPattern(pattern);
        formatter = formatter.withZone(dtz);

        DateTime originalDateTime = formatter.parseDateTime(timePayload.getHour());
        DateTime newDateTime = originalDateTime.toDateTime(DateTimeZone.UTC);

        String hours = newDateTime.toString(pattern);
        Time time = new Time(hours);
        TimeResponse timeResponse = new TimeResponse(time);

        return gson.toJson(timeResponse);
    }

}
