package com.example.demo_logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {

  @GetMapping
  public String greet(){
    log.info("greeting");
    return "Hello world!";
  }
}
