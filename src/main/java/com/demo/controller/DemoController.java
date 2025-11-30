package com.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/health")
    public ResponseEntity<String> getDetails(){
        return new ResponseEntity<>("Application is Running !! ", HttpStatus.OK);

    }

    @GetMapping("/get")
    public ResponseEntity<String> getCurrentData(){
        return new ResponseEntity<>("Second Development !!",HttpStatus.OK);
    }

    @GetMapping("/something")
    public ResponseEntity<String> getSomething(){
        return new ResponseEntity<>("Something Api triggerred !!",HttpStatus.OK);
    }
}
