package com.chatApp.webSocketAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {
    @GetMapping("/")
    public ResponseEntity<String> home(){
        return new ResponseEntity<String>("hello testing", HttpStatus.OK);
    }
}
