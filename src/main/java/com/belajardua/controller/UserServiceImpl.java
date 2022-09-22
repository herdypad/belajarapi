package com.belajardua.controller;

import com.belajardua.model.User;
import com.belajardua.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository user;

    @Override
    public List<User> getALl() {
        List<User> a = user.findAll();
        return a;
    }

    @Override
    public User addData(User a) {
        return user.save(a);
    }

    @Override
    public void hapusSemua() {
        user.deleteAll();
    }
}
