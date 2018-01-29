/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Djair Maykon
 */
public class ConnectionFactory {

    final private String URL = "jdbc:firebirdsql:localhost/3050:C:\\Users\\Djair Maykon\\Desktop\\Kenda\\Banco de Dados\\BANCO KENDA.FDB";
    final private String USUARIO = "sysdba";
    final private String SENHA = "masterkey";
    
    public Connection getConnection() {
        
        try {
            
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        
        } catch (SQLException | ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        
    }
    
    
    
}
