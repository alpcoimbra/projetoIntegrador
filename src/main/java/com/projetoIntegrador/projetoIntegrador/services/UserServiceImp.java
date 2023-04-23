package com.projetoIntegrador.projetoIntegrador.services;

import com.projetoIntegrador.projetoIntegrador.domain.UserData;
import com.projetoIntegrador.projetoIntegrador.domain.dto.UserDataDto;
import com.projetoIntegrador.projetoIntegrador.exception.UserNotFoundException;
import com.projetoIntegrador.projetoIntegrador.mapper.UserDataMapper;
import com.projetoIntegrador.projetoIntegrador.repositories.UserRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

    UserDataMapper INSTANCE = Mappers.getMapper(UserDataMapper.class);

    private static Logger logger = LoggerFactory.getLogger(UserServiceImp.class);

    @Autowired
    private UserRepository repository;

    public void saveData(UserDataDto userDto) {
        UserData user = INSTANCE.dtoToUserData(userDto);
        repository.save(user);
    }

    public List<UserDataDto> getAllUsers() {
        List<UserData> list = repository.findAll();
        List<UserDataDto> newList = INSTANCE.listUserDataToDto(list);
        return newList;
    }

    public String deleteData(Long id){
        repository.deleteById(id);
        return "Usuario deletado com sucesso!";
    }



    public UserData updateData(UserData newUser, String email){
        UserData antigoUsuario = repository.findByEmail(email);
        //copyToEntity(newUser, antigoUsuario);
        return antigoUsuario;
    }

    public UserDataDto getUserById(Long id) {
        UserData user = repository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
        UserDataDto userDataDto = INSTANCE.userDataToDto(user);
        return userDataDto;
    }


    public UserData getUserByUsername(String userEmail) {
        UserData user = repository.findByEmail(userEmail);
        if (user == null) {
            logger.error("User not found: " + userEmail);
        }
        logger.info("User found: " + userEmail);
        return user;
    }

//    private void copyToEntity(UserData newUser, UserData antigoUsuario) {
//        antigoUsuario.setNomeCompleto(newUser.getNomeCompleto());
//        antigoUsuario.setDataNascimento(newUser.getDataNascimento());
//        antigoUsuario.setUf(newUser.getUf());
//        antigoUsuario.setCidade(newUser.getCidade());
//        antigoUsuario.setProfissao(newUser.getProfissao());
//        antigoUsuario.setAreaFormacao(newUser.getAreaFormacao());
//    }

}
