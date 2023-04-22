package com.projetoIntegrador.projetoIntegrador.Domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Getter
@Setter
@Table (name="tb_user")
public class UserData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
