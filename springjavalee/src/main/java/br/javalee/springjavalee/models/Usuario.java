package br.javalee.springjavalee.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    /*
     * id int NOT NULL AUTO_INCREMENT, 
     * nome varchar(100) NOT NULL, 
     * racf varchar(7) NOT NULL, 
     * email varchar(100) NOT NULL, 
     * linkfoto varchar(200) DEFAULT NULL,
     * senha varchar(30) DEFAULT NULL, 
     * constraint pk_usuario PRIMARY KEY (id),
     * constraint UNIQUE KEY UK_email_usuario (email), 
     * constraint UNIQUE KEY UK_racf_usuario (racf)
     */

    @Id // indica chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "racf", length = 7, nullable = false, unique = true)
    private String racf;

    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "linkfoto", length = 200)
    private String linkfoto;

    @Column(name = "senha", length = 30, nullable = false)
    private String senha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRacf() {
        return racf;
    }

    public void setRacf(String racf) {
        this.racf = racf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkfoto() {
        return linkfoto;
    }

    public void setLinkfoto(String linkfoto) {
        this.linkfoto = linkfoto;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
