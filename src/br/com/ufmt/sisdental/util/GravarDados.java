/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufmt.sisdental.util;

import br.com.sisdental.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DavidFrancisco
 */
public class GravarDados {
    
    /**
     *
     * @return
     */
    public boolean consultar(String nome, String senha){
        boolean autenticado = false; 
         try {
             String sql = "SELECT FROM USUARIO WHERE NOME = ? SENHA = ?";
             Connection con=ConnBD.getConnection();
             PreparedStatement  ps = con.prepareStatement(sql);
             ps.setString(1, nome);
             ps.setString(1, senha);
             
             ResultSet rs = ps.executeQuery();
             
             if (rs.next()){
                 
                 String loginBanco = rs.getString(nome);
                 String senhaBanco = rs.getString(senha);
                 
                 autenticado=true;
                 
             }
             ps.close();    
             return autenticado;
              
             
         } catch (SQLException ex) {
             Logger.getLogger(GravarDados.class.getName()).log(Level.SEVERE, null, ex);
             throw new RuntimeException();
         }
        
          
 
    

    }

}