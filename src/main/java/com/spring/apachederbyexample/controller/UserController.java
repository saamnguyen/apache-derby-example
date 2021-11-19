package com.spring.apachederbyexample.controller;

import com.spring.apachederbyexample.model.UserRecord;
import com.spring.apachederbyexample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<UserRecord> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/add-user")
    public void addUser(@RequestBody UserRecord userRecord){
        userService.addUser(userRecord);
    }

    @DeleteMapping("/delete-by-id")
    public void deleteUser(@RequestParam(name = "id") String id){
        userService.deleteUser(id);
    }

}
