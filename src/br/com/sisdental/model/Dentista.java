/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisdental.model;

/**
 *
 * @author DavidFrancisco
 */
public class Dentista extends Pessoa{
   
    private int id;
    private String cro;

    public Dentista() {
    }

    public Dentista(String nome, String rg, String cpf, sexoType sexo, Endereco endereco, Contato contato) {
        super(nome, rg, cpf, sexo, endereco, contato);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) {
        this.cro = cro;
    }
   
    
    

    
}
