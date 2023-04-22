package com.projetoIntegrador.projetoIntegrador.controllers;


import com.projetoIntegrador.projetoIntegrador.domain.UserData;
import com.projetoIntegrador.projetoIntegrador.mapper.UserDataMapper;
import com.projetoIntegrador.projetoIntegrador.services.UserServiceImp;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.hibernate.annotations.common.util.impl.LoggerFactory.logger;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    UserDataMapper INSTANCE = Mappers.getMapper(UserDataMapper.class);

    private static Logger logger = LoggerFactory.getLogger(UserServiceImp.class);

    private UserServiceImp service;

    public UserController(UserServiceImp service) {
        this.service = service;
    }

    @PostMapping("/user")
    public ResponseEntity<UserData> saveNewUser(@RequestBody UserData userData) {

        if (userData == null) {
            throw new RuntimeException();
        } else {
            service.saveData(userData);
        }

        logger(UserData.class);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserData>> getAllUsers() {
        List<UserData> listUsers = service.getAllUsers();
        return ResponseEntity.ok().body(listUsers);
    }
}


