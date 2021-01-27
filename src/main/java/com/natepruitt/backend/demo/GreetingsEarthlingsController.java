package com.natepruitt.backend.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsEarthlingsController {

    @GetMapping("/greetingsearthlings")
    public String greetEarthlings(){
        return "Greetings Earthlings!";
    }

}