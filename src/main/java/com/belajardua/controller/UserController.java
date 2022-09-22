package com.belajardua.controller;

import com.belajardua.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/getall")
    public List<User> getAll(){
        return userService.getALl();
    }

    @PostMapping(value = "/add")
    public User add(@RequestBody User a){
        return userService.addData(a);
    }

    @DeleteMapping(value = "deleteall")
    public String hapus(){
        userService.hapusSemua();
        return "Hapus Berhasil";
    }
}
