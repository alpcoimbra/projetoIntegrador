package com.projetoIntegrador.projetoIntegrador.domain.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
public class UserDataDto {

    //private Long id;
    private String nomeCompleto;
    private String dataNascimento;
    private String cidade;
    private String uf;
    private String areaFormacao;
    private String profissao;
    private String email;
    private String senha;

}
