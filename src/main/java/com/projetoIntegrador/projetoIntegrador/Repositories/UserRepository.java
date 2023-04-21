package com.projetoIntegrador.projetoIntegrador.Repositories;

import com.projetoIntegrador.projetoIntegrador.Domain.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <Long, UserData> {
}
