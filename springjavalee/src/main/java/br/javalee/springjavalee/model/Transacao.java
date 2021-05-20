package br.javalee.springjavalee.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mtb310_transaction")
public class Transacao {

    // id_transacao integer not null auto_increment,
    // data_hora datetime,
    // dispositivo integer,
    // valor_solic float,
    // valor_aut float,
    // status integer,
    // ag_financeiro integer not null,
    // constraint pk_trans primary key (id_transacao),
    // constraint fk_agente foreign key (ag_financeiro) references
    // mtb310_ag_financeiro(id_agente)

    @Id // indica chave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transacao")
    private int id;

    @Column(name = "data_hora")
    private LocalDate data_hora;

    @Column(name = "dispositivo")
    private int dispositivo;

    @Column(name = "valor_solic")
    private float valor_solic;

    @Column(name = "valor_aut")
    private float valor_aut;

    @Column(name = "status")
    private int status;

    @OneToOne
    @JoinColumn(name = "ag_financeiro")
    private AgenteFinanceiro agFinanceiro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData_hora() {
        return data_hora;
    }

    public void setData_hora(LocalDate data_hora) {
        this.data_hora = data_hora;
    }

    public int getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(int dispositivo) {
        this.dispositivo = dispositivo;
    }

    public float getValor_solic() {
        return valor_solic;
    }

    public void setValor_solic(float valor_solic) {
        this.valor_solic = valor_solic;
    }

    public float getValor_aut() {
        return valor_aut;
    }

    public void setValor_aut(float valor_aut) {
        this.valor_aut = valor_aut;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public AgenteFinanceiro getAgFinanceiro() {
        return agFinanceiro;
    }

    public void setAgFinanceiro(AgenteFinanceiro agFinanceiro) {
        this.agFinanceiro = agFinanceiro;
    }

}
