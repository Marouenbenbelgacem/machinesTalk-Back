package com.machinestalk.machinest.services;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.machinestalk.machinest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserServices {

    @Autowired(required = true)
    private RestTemplate restTemplate;
    @Autowired
    private UserRepository userRepository;

    public String getAllUsers() {

         String result = restTemplate.getForObject("https://jsonplaceholder.typicode.com/users", String.class);

         System.out.print(result);
         return result;

    }
}
