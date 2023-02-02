package com.example.demoSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @GetMapping({"/greeting"})
    public Greeting greeting(@RequestParam(defaultValue = "World") String name) {
        System.out.println("gre");
        return new Greeting(this.counter.incrementAndGet(), String.format("Hello, %s!", name));
    }
}
