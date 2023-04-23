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
//
//    public UserData(Long id, String nomeCompleto, String dataNascimento, String cidade, String uf, String areaFormacao, String profissao, String email, String senha) {
//        this.id = id;
//        this.nomeCompleto = nomeCompleto;
//        this.dataNascimento = dataNascimento;
//        this.cidade = cidade;
//        this.uf = uf;
//        this.areaFormacao = areaFormacao;
//        this.profissao = profissao;
//        this.email = email;
//        this.senha = senha;
//    }
//
//    public UserData() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getNomeCompleto() {
//        return nomeCompleto;
//    }
//
//    public String getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public String getCidade() {
//        return cidade;
//    }
//
//    public String getUf() {
//        return uf;
//    }
//
//    public String getAreaFormacao() {
//        return areaFormacao;
//    }
//
//    public String getProfissao() {
//        return profissao;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getSenha() {
//        return senha;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public void setNomeCompleto(String nomeCompleto) {
//        this.nomeCompleto = nomeCompleto;
//    }
//
//    public void setDataNascimento(String dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }
//
//    public void setCidade(String cidade) {
//        this.cidade = cidade;
//    }
//
//    public void setUf(String uf) {
//        this.uf = uf;
//    }
//
//    public void setAreaFormacao(String areaFormacao) {
//        this.areaFormacao = areaFormacao;
//    }
//
//    public void setProfissao(String profissao) {
//        this.profissao = profissao;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
}
