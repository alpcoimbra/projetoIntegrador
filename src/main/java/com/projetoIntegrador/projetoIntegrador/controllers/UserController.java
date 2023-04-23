package com.projetoIntegrador.projetoIntegrador.controllers;


import com.projetoIntegrador.projetoIntegrador.domain.UserData;
import com.projetoIntegrador.projetoIntegrador.mapper.UserDataMapper;
import com.projetoIntegrador.projetoIntegrador.services.UserServiceImp;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    UserDataMapper INSTANCE = Mappers.getMapper(UserDataMapper.class);

    private static Logger logger = LoggerFactory.getLogger(UserServiceImp.class);

    private UserServiceImp service;

    @Autowired
    public UserController(UserServiceImp service) {
        this.service = service;
    }

    @PostMapping("/user")
    public ResponseEntity<UserData> createUser(@RequestBody UserData userData) {
        service.saveData(userData);
        return new ResponseEntity<>(userData, HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserData>> getAllUsers() {
        List<UserData> listUsers = service.getAllUsers();
        return ResponseEntity.ok().body(listUsers);
    }
}


