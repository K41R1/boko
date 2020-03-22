package org.algorism.boko.controller;

import java.util.Properties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageController {

    @GetMapping(path = {"/", "/home"})
    public Properties home() {
        Properties status = new Properties();
        status.put("state", "working");
        status.put("timestamp", String.valueOf(System.currentTimeMillis()));
        return status;
    }
    
}