package com.projetoIntegrador.projetoIntegrador.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class UserData implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nomeCompleto;

    @Column
    private String dataNascimento;

    @Column
    private String cidade;

    @Column
    private String uf;

    @Column
    private String areaFormacao;

    @Column
    private String profissao;

    @Column
    private String email;

    @Column
    private String senha;

}
