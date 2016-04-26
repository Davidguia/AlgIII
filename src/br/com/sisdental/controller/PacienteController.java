/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sisdental.controller;

import br.com.sisdental.model.Contato;
import br.com.sisdental.model.Endereco;
import br.com.sisdental.model.Paciente;
import br.com.ufmt.sisdental.dao.PacienteDao;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DavidFrancisco
 */
public class PacienteController {
    
    public void salvar( String nome, String rg, String cpf) 
		throws SQLException, ParseException 
	{
        Paciente paciente = new Paciente();
        //paciente.setId(id);
        paciente.setNome(nome);
        paciente.setRg(rg);
        paciente.setCpf(cpf);
        //paciente.setEndereco(endereco);
        //paciente.setContato(contato);
        

        new PacienteDao().salvar(paciente);
    }

    public void alterar(long id, String nome, String rg, String cpf, Endereco endereco, Contato contato) 
		throws ParseException, SQLException 
	{
        
		Paciente paciente = new Paciente();
        paciente.setId(id);
        paciente.setNome(nome);
        paciente.setRg(rg);
        paciente.setCpf(cpf);
        //paciente.getEndereco(endereco);
        //paciente.getContato(contato);
        

        new PacienteDao().update(paciente);
    }
    
    public List<Paciente> listaPacientes() {
     PacienteDao dao = new PacienteDao();
        try {
            return dao.findPaciente();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
				"Problemas ao localizar contaton" + 
				e.getLocalizedMessage()
			);
        }
        return null;
    }
    
    public void excluir(long id) throws SQLException {
        new PacienteDao().excluir(id);
    }

    public Paciente buscaPacientePorNome(String nome) throws SQLException {
        PacienteDao dao = new PacienteDao();
        return dao.findByName(nome);
    }

    
    
}
