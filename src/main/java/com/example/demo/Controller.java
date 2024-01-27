package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springNative")
public class Controller {

    @GetMapping("/jrf")
    public String getSpringNative() throws InterruptedException {


       return "Hola Prueba Spring Native y JRF";

    }


}