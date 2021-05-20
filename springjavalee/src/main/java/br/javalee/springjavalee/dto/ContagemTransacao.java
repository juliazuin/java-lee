package br.javalee.springjavalee.dto;

//import br.javalee.springjavalee.models.AgenteFinanceiro;

public class ContagemTransacao {
    private String nomeAgente;
    private double volumeTransacional;
    private int status;
    private long count;
  

    public ContagemTransacao(String nomeAgente,double volumeTransacional, int status, long count){
        this.nomeAgente = nomeAgente;
        this.volumeTransacional = volumeTransacional;
        this.status = status;
        this.count = count;

    }

    public String getNomeAgente() {
        return nomeAgente;
    }


    public void setNomeAgente(String nomeAgente) {
        this.nomeAgente = nomeAgente;
    }


    public double getVolumeTransacional() {
        return volumeTransacional;
    }


    public void setVolumeTransacional(double volumeTransacional) {
        this.volumeTransacional = volumeTransacional;
    }


    public int getStatus() {
        return status;
    }


    public void setStatus(int status) {
        this.status = status;
    }


    public long getCount() {
        return count;
    }


    public void setCount(long count) {
        this.count = count;
    }

    
}
