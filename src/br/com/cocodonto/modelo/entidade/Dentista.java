/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cocodonto.modelo.entidade;

/**
 *
 * @author DavidFrancisco
 */
public class Dentista {
   
    private int id;
    private String cro;
    private String nome;
    private String cpf;
    private String rg;
    
    private Endereco endereco;
    private Contato contato;

    public Dentista(int id, String cro, String cpf, String rg) {
        this.id = id;
        this.cro = cro;
        this.cpf = cpf;
        this.rg = rg;
    }
    
}
