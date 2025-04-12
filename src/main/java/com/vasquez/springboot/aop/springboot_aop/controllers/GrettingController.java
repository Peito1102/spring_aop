package com.vasquez.springboot.aop.springboot_aop.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.vasquez.springboot.aop.springboot_aop.services.GreetingService;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class GrettingController {

    @Autowired
    private GreetingService greeting;

    @GetMapping("/greeting")
    public ResponseEntity<?> greeting() {
        return ResponseEntity.ok(Collections.singletonMap("greeting",greeting.sayHello("Pepito", "gou p mrd!")));
    }
    
    @GetMapping("/greeting-error")
    public ResponseEntity<?> greetingError() {
        return ResponseEntity.ok(Collections.singletonMap("greeting",greeting.sayHelloError("Pepito", "gou p mrd!")));
    }

}
