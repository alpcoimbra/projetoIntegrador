package com.projetoIntegrador.projetoIntegrador.services;

import com.projetoIntegrador.projetoIntegrador.domain.UserData;

import java.util.List;

public interface UserService {

    public UserData updateData(UserData newUser, String email);

    public UserData getUserByUsername(String userEmail);

    public String deleteData(Long id);

    public void saveData(UserData user);

    List<UserData> getAllUsers();
}
