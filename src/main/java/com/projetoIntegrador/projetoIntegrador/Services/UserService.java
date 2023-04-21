package com.projetoIntegrador.projetoIntegrador.Services;

import com.projetoIntegrador.projetoIntegrador.Domain.UserData;
import com.projetoIntegrador.projetoIntegrador.Repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetailsService;

@Service
public class UserService implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRepository repository;
    @Autowired
    private UserData user;

    public void saveData(UserData user) {
        repository.save(user);
    }

    public void deleteData(Long id){
        repository.deleteById(id);
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

    @Override
    public UserDetails loadUserByUsername(String userEmail) {
        UserData user = repository.findByEmail(userEmail);
        if (user == null) {
            logger.error("User not found: " + userEmail);
        }
        logger.info("User found: " + userEmail);
        return user;
    }


}
