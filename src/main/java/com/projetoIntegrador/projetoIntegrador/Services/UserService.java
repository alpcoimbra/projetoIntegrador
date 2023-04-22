package com.projetoIntegrador.projetoIntegrador.Services;

import com.projetoIntegrador.projetoIntegrador.Domain.UserData;

public interface UserService {

    UserData upadteData(UserData newUser, String email);

    UserData loadUserByUsername(String userEmail);

    String deleteData(Long id);

    String saveData(UserData user);
}
