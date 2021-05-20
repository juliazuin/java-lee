package br.javalee.springjavalee.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "mtb310_ag_financeiro")
public class AgenteFinanceiro {

    // id_agente integer not null auto_increment,
    // nome_agente varchar(100),
    // volume_transacional float,
    // constraint pk_agente primary key (id_agente)

    @Id // indica chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agente")
    private int id_agente;

    @Column(name = "nome_agente", length = 100)
    private String nome_agente;

    @Column(name = "volume_transacional")
    private float volume_transacional;

    @OneToMany(mappedBy = "agFinanceiro") // qual campo da tabela equipamento sinaliza a FK
    @JsonIgnoreProperties("agFinanceiro")
    private List<Transacao> transacao;

    public int getId_agente() {
        return id_agente;
    }

    public void setId_agente(int id_agente) {
        this.id_agente = id_agente;
    }

    public String getNome_agente() {
        return nome_agente;
    }

    public void setNome_agente(String nome_agente) {
        this.nome_agente = nome_agente;
    }

    public float getVolume_transacional() {
        return volume_transacional;
    }

    public void setVolume_transacional(float volume_transacional) {
        this.volume_transacional = volume_transacional;
    }
}
