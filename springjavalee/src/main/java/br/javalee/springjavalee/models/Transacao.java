package br.javalee.springjavalee.models;

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
@Table(name="mtb310_transaction")
public class Transacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transacao")
    private int idTrasancao;

    @Column(name = "data_hora", nullable = true)
    private LocalDate datahora;

    @Column(name = "dispositivo", nullable = true)
    private int dispositivo;

    @Column(name = "valor_solicitado", nullable = true)
    private double valorSolicitado;

    @Column(name = "valor_autorizado", nullable = true)
    private double valorAutorizado;

    @Column(name = "status", nullable = true)
    private int status;

    @OneToOne
    @JoinColumn(name = "ag_financeiro")
    private AgenteFinanceiro agenteFinanceiro;

    public int getIdTrasancao() {
        return idTrasancao;
    }

    public void setIdTrasancao(int idTrasancao) {
        this.idTrasancao = idTrasancao;
    }

    public LocalDate getDatahora() {
        return datahora;
    }

    public void setDatahora(LocalDate datahora) {
        this.datahora = datahora;
    }

    public int getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(int dispositivo) {
        this.dispositivo = dispositivo;
    }

    public double getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(double valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public double getValorAutorizado() {
        return valorAutorizado;
    }

    public void setValorAutorizado(double valorAutorizado) {
        this.valorAutorizado = valorAutorizado;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public AgenteFinanceiro getAgenteFinanceiro() {
        return agenteFinanceiro;
    }

    public void setAgenteFinanceiro(AgenteFinanceiro agenteFinanceiro) {
        this.agenteFinanceiro = agenteFinanceiro;
    }
}
