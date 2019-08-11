package com.sumit.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
  
  @GetMapping("hello")
  public String helloWorld() {
    return "Hello World";
  }
  
}
