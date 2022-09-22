package com.belajardua;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hallo")
    public String hallo (){
        return "Hallo";
    }
    @GetMapping("/test")
    public String test (){
        return "Hallo";
    }
}
