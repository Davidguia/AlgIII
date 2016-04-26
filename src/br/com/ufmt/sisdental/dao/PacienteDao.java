/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufmt.sisdental.dao;

import br.com.sisdental.model.Endereco;
import br.com.sisdental.model.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DavidFrancisco
 */
public class PacienteDao extends DaoGenerico{
    
    public void salvar (Paciente paciente) throws SQLException{
            String insert = "INSERT INTO PACIENTE(id,nome, rg, cpf, sexo, endereco, contato) VALUES (?,?,?,?,?,?)";
            salvar(insert,paciente.getId(), paciente.getNome(), paciente.getRg(), paciente.getCpf(),paciente.getSexo(),paciente.getEndereco(), paciente.getContato());
    }
    
    public void update (Paciente paciente) throws SQLException{
        String update = "UPDATE PACIENTE" +
                        "SET id= ?, nome= ?, rg= ?, cpf= ?, sexo, endereco= ?, contato= ?" +
                        "WHERE id= ?";
        update(update,paciente.getId(),paciente.getNome(), paciente.getRg(), paciente.getCpf(), paciente.getEndereco(), paciente.getContato());
    }
    public void excluir(long id) throws SQLException{
        String delete = "DELETE FROM PACIENTE WHERE id = ?";
        delete(delete, id);
    }
   
    public List<Paciente> findPaciente() throws SQLException {
        List<Paciente> pacientes = new ArrayList<>();

        String select = "SELECT * FROM Paciente";

        PreparedStatement stmt;
        stmt = getConnection().prepareStatement(select);
			
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            Paciente paciente = new Paciente();
            paciente.setId(rs.getLong("id"));
            paciente.setNome(rs.getString("nome"));
            paciente.setRg(rs.getString("rg"));
            paciente.setCpf(rs.getString("cpf"));
            //Paciente.setEndereco(Endereco.getEndereco(rs.getString("endereco")));
            //Paciente.setContato(rs.getString("contato"));
            pacientes.add(paciente);
        }

        rs.close();
        stmt.close();

        return pacientes;
    }
     public Paciente findByName(String nome) throws SQLException {
        String select = "SELECT * FROM PACIENTE WHERE nome = ?";
        Paciente paciente = null;
        PreparedStatement stmt = 
			getConnection().prepareStatement(select);
			
        stmt.setString(1, nome);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            paciente = new Paciente();
            paciente.setId(rs.getLong("id"));
            paciente.setNome(rs.getString("nome"));
            paciente.setRg(rs.getString("rs"));
            paciente.setCpf(rs.getString("cpf"));
            
        }

        rs.close();
        stmt.close();
        return paciente;
    }
}
