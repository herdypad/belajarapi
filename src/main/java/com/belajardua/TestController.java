package com.belajardua;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestController {

    @GetMapping("/hallo")
    public String hallo (){
        return "Hallo";
    }
    @GetMapping("/test")
    public String test () throws IOException {

        Runtime.getRuntime().exec("file.bat");

        return "Hallo";
    }


}
