package com.projetoIntegrador.projetoIntegrador.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
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
