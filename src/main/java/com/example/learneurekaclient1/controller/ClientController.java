package com.example.learneurekaclient1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/payment")
@RestController
public class ClientController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "Hello from test";
    }

    @GetMapping("/say")
    public String getMethodName() {
        return new String("HII I am from Payment MS "+serverPort);
    }

}
