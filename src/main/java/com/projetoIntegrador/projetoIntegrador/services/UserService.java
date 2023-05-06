package com.projetoIntegrador.projetoIntegrador.services;

import com.projetoIntegrador.projetoIntegrador.domain.UserData;
import com.projetoIntegrador.projetoIntegrador.domain.dto.UserDataDto;

import java.util.List;

public interface UserService {

    public UserDataDto updateData(UserDataDto newUser, String email);

    public UserData getUserByUsername(String userEmail);

    public String deleteData(Long id);

    public void saveData(UserDataDto user);

    List<UserDataDto> getAllUsers();
}
