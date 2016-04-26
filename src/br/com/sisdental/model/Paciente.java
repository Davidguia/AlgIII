/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisdental.model;

import java.util.Objects;

/**
 *
 * @author DavidFrancisco
 */
public class Paciente extends Pessoa {
    
    private int id;

    public Paciente(){
        
    }
    
    public Paciente(int id,String nome, String rg, String cpf, sexoType sexo, Endereco endereco, Contato contato) {
        super(nome, rg, cpf, sexo, endereco, contato);
    }

    
    


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = (int) id;
    }

    

    

    

    

    

    

   

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
      
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Paciente other = (Paciente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
        
        
    @Override
    public String toString() {
        return  "Paciente{" + "id=" + id + '}';
    }

   
}
     
    










