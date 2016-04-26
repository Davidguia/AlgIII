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
public enum  sexoType {
    M("Masculino")
   ,F("Feminino");
     
    private String descricao;
    
    private sexoType(String descricao){
         this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
