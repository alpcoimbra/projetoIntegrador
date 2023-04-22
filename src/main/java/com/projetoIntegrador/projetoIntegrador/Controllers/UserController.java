package com.projetoIntegrador.projetoIntegrador.Controllers;


import com.projetoIntegrador.projetoIntegrador.Domain.UserData;
import com.projetoIntegrador.projetoIntegrador.Services.UserServiceImp;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserServiceImp service;

    public UserController(UserServiceImp service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<UserData> getIndexPage(@RequestBody UserData userData) {

        UserData user;
        if (userData != null) {
            user = userData;
            service.saveData(user);
        } else {
            throw new RuntimeException("No user to save!");
        }

        return ResponseEntity.ok(user);
    }
}
