package com.projetoIntegrador.projetoIntegrador.Domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class UserData {

    private Long ID;
    private String nomeCompleto;
    private String dataNascimento;
    private String cidade;
    private String uf;
    private String areaFormacao;
    private String profissao;
    private String email;
    private String senha;






}
