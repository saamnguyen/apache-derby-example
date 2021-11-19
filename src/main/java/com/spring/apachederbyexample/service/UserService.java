package com.spring.apachederbyexample.service;

import com.spring.apachederbyexample.model.UserRecord;
import com.spring.apachederbyexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserRecord> getAllUsers(){
        List<UserRecord> userRecords = new ArrayList<>();
        userRepository.findAll().forEach(userRecords::add);
        return userRecords;
    }

    public void addUser(UserRecord userRecord){
        userRepository.save(userRecord);
    }

    public void deleteUser(String id){
        userRepository.deleteById(id);
    }
}
