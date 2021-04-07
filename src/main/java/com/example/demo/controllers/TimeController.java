package com.example.demo.controllers;

import com.example.demo.models.TimePayload;
import com.example.demo.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@CrossOrigin("*")
@RestController()
public class TimeController {

    @Autowired
    TimeService timeService;

    @GetMapping("/time")
    public String getTime() {
        return "asasd";
    }

    @PostMapping("/time")
    public ResponseEntity<String> convertTime(@RequestBody TimePayload timePayload) throws ParseException {
        String response = timeService.convertHour(timePayload);
        return ResponseEntity.ok().body(response);
    }
}
