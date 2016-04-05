/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cocodonto.modelo.entidade;

import java.util.Objects;

/**
 *
 * @author DavidFrancisco
 */
public class Paciente {
    
    private long id;
    private String nome;
    private String rg;
    private String cpf;
    private sexoType sexo;
    
    private Endereco endereco;

    private Contato contato;

    public Paciente(long id, String nome, String rg, String cpf, Endereco endereco, Contato contato) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.contato = contato;
    }

    public Paciente(long id, String nome, String rg, String cpf, sexoType sexo) {
        this.id = id;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public Paciente(String nome, String rg, String cpf, sexoType sexo) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public sexoType getSexo() {
        return sexo;
    }

    public void setSexo(sexoType sexo) {
        this.sexo = sexo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.rg);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.sexo);
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
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  "Paciente{" + "id=" + id + ", "
                + "nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", "
                + "sexo=" + sexo + ", endereco=" + endereco + ", contato=" 
                + contato + '}';
    }

   

     
    
}
