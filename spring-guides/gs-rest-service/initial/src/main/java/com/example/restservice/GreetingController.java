package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingController {

  public final static String template = "Hi, %s";
  public final AtomicLong counter = new AtomicLong();


  @GetMapping("/greeting")
  public Greeting greeting(@RequestParam(defaultValue="World") String name) {
    return new Greeting(counter.incrementAndGet(),template.formatted(name));
  }

}


