package com.zhongruan.controller;

import com.zhongruan.bean.User;
import com.zhongruan.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
public class UserHandler {
    @Autowired
    UserRepository userRepository;

    // Restful API

    @GetMapping("/findAll")
    public Collection<User> findAll() {
        return userRepository.findAll();
    }

    //  findAll?id=1      ===>      findAll/1
    @GetMapping("/findById/{id}")
    public User findById(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        userRepository.saveOrUpdate(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable int id) {
        userRepository.deleteById(id);
    }

}
