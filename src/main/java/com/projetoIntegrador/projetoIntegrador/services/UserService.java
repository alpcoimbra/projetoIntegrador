package com.projetoIntegrador.projetoIntegrador.services;

import com.projetoIntegrador.projetoIntegrador.domain.UserData;

import java.util.List;

public interface UserService {


    UserData updateData(UserData newUser, String email);

    UserData getUserByUsername(String userEmail);

    String deleteData(Long id);

    void saveData(UserData user);

    List<UserData> getAllUsers();
}
