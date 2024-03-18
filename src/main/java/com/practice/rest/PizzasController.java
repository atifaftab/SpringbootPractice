package com.practice.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PizzasController {

    @Value("${server.port}")
    private String serverPort;

    @GetMapping
    public void get() {
        System.out.println("server : "+serverPort);
    }
}
