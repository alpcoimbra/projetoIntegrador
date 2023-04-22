package com.projetoIntegrador.projetoIntegrador.Services;

import com.projetoIntegrador.projetoIntegrador.Domain.UserData;
import com.projetoIntegrador.projetoIntegrador.Repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    private static Logger logger = LoggerFactory.getLogger(UserServiceImp.class);
    @Autowired
    private UserRepository repository;


    public String saveData(UserData user) {
        repository.save(user);
        return "Usuario salvo com sucesso!";
    }

    public String deleteData(Long id){
        repository.deleteById(id);
        return "Usuario deletado com sucesso!";
    }

    public UserData upadteData(UserData newUser, String email){
        UserData antigoUsuario = repository.findByEmail(email);
        copyToEntity(newUser, antigoUsuario);
        return antigoUsuario;
    }

    private void copyToEntity(UserData newUser, UserData antigoUsuario) {
        antigoUsuario.setNomeCompleto(newUser.getNomeCompleto());
        antigoUsuario.setDataNascimento(newUser.getDataNascimento());
        antigoUsuario.setUf(newUser.getUf());
        antigoUsuario.setCidade(newUser.getCidade());
        antigoUsuario.setProfissao(newUser.getProfissao());
        antigoUsuario.setAreaFormacao(newUser.getAreaFormacao());
    }


    public UserData loadUserByUsername(String userEmail) {
        UserData user = repository.findByEmail(userEmail);
        if (user == null) {
            logger.error("User not found: " + userEmail);
        }
        logger.info("User found: " + userEmail);
        return user;
    }


}
