    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ufmt.sisdental.dao;

import br.com.ufmt.sisdental.util.ConnBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DavidFrancisco
 */
public abstract class DaoGenerico {
    Connection connection;
    protected DaoGenerico(){
        this.connection = ConnBD.getConnection();                
    }
    
    protected Connection getConnection(){
        return connection;
    }
    
    protected void salvar (String insertSql, Object... param) throws SQLException{
        PreparedStatement ps;
        ps = getConnection().prepareStatement(insertSql);
        for (int i = 0;i < param.length; i++){
            ps.setObject(i+1, param[i]);
            
        }
        ps.execute();
        ps.close();
    }
    protected void update(String updateSql, Object id, Object... param) throws SQLException{
        PreparedStatement ps =
                             getConnection().prepareStatement(updateSql);
        
        for (int i = 0; i < param.length; i++){
            ps.setObject(i+1, param[i]);
        }
        ps.setObject(param.length + 1, id);
        ps.execute();
        ps.close();
        
    }
    
     protected void delete(String deleteSql, Object... param) throws SQLException {
        PreparedStatement pstmt = 
			getConnection().prepareStatement(deleteSql);
			
        for (int i = 0; i < param.length; i++) {
            pstmt.setObject(i+1, param[i]);
        }

        pstmt.execute();
        pstmt.close();
    }
}

