package com.projetoIntegrador.projetoIntegrador.repositories;

import com.projetoIntegrador.projetoIntegrador.domain.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserData, Long> {
    UserData findByEmail(String email);


}
