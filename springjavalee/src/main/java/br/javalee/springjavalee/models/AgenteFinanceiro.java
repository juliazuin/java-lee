package br.javalee.springjavalee.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mtb310_ag_financeiro")
public class AgenteFinanceiro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agente")
    private int idAgente;

    @Column(name = "nome_agente",length = 100, nullable = true)
    private String nomeAgente;

    @Column(name = "volume_transacional",nullable = true)
    private int volumeTransacional;

    public int getIdAgente() {
        return idAgente;
    }

    public void setIdAgente(int idAgente) {
        this.idAgente = idAgente;
    }

    public String getNomeAgente() {
        return nomeAgente;
    }

    public void setNomeAgente(String nomeAgente) {
        this.nomeAgente = nomeAgente;
    }

    public int getVolumeTransacional() {
        return volumeTransacional;
    }

    public void setVolumeTransacional(int volumeTransacional) {
        this.volumeTransacional = volumeTransacional;
    }

    
}
