package com.RealNobroker.controller;

import com.RealNobroker.payload.UserDto;
import com.RealNobroker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {
        Long userid = userService.createUser(userDto);
        return new ResponseEntity<>("User is created...& user id:" + userid, HttpStatus.CREATED);
    }
}
