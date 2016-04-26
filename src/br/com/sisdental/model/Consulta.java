package br.com.sisdental.model;

import java.util.Date;

public class Consulta {
	
	private int id;
	
	private Dentista dentista;
	
	private Paciente paciente;
	
	private Date dataCriacao;
	
	private double valor;
	
	private Procedimento tratamento;
	
	private Odontograma odontograma;

    public Consulta() {
    }

    public Consulta(int id, Dentista dentista, Paciente paciente, Date dataCriacao, double valor, Procedimento tratamento, Odontograma odontograma) {
        this.id = id;
        this.dentista = dentista;
        this.paciente = paciente;
        this.dataCriacao = dataCriacao;
        this.valor = valor;
        this.tratamento = tratamento;
        this.odontograma = odontograma;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Dentista getDentista() {
        return dentista;
    }

    public void setDentista(Dentista dentista) {
        this.dentista = dentista;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Procedimento getTratamento() {
        return tratamento;
    }

    public void setTratamento(Procedimento tratamento) {
        this.tratamento = tratamento;
    }

    public Odontograma getOdontograma() {
        return odontograma;
    }

    public void setOdontograma(Odontograma odontograma) {
        this.odontograma = odontograma;
    }
	
	
	
	

}
