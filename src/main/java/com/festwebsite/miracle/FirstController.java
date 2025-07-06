package com.festwebsite.miracle;


import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from my First Controller";
    }
    @PostMapping("/post")
    public String post(
            @RequestBody String message){
        return "Request Accepted and message is " + message;
    }

}

