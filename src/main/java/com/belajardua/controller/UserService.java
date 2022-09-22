package com.belajardua.controller;

import com.belajardua.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {

    List<User> getALl();

    User addData(User a);

    void hapusSemua();
}
