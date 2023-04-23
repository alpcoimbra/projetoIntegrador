package com.projetoIntegrador.projetoIntegrador.controllers;


import com.projetoIntegrador.projetoIntegrador.domain.dto.UserDataDto;
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
    public ResponseEntity<UserDataDto> createUser(@RequestBody UserDataDto userDataDto) {
        service.saveData(userDataDto);
        return new ResponseEntity<>(userDataDto, HttpStatus.CREATED);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserDataDto>> getAllUsers() {
        List<UserDataDto> listUsers = service.getAllUsers();
        return ResponseEntity.ok().body(listUsers);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDataDto> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getUserById(id));
    }
}


