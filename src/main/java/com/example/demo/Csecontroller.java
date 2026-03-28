package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Csecontroller {

    @GetMapping("/csehome")
    public String rocks() {
        return "WELCOME TO CSE KUBERNETES";
    }
}
