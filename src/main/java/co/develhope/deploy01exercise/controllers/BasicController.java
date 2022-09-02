package co.develhope.deploy01exercise.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping
    public String getProperty(){
        String devName = "Mattia Oleandro";
        return devName;
    }
}
