package com.machinestalk.machinest.controllers;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.machinestalk.machinest.services.UserServiceImpl;
import com.machinestalk.machinest.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class userMachinesTalkController {

    @Autowired
    private UserServices userService;

    @GetMapping("/users")
    public String getUsers() {
        String res = this.userService.getAllUsers();
     return  res;
    }


}
