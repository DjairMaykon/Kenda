/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Djair Maykon
 */
public class MConnectionFactory {

    private String URL = "jdbc:firebirdsql:localhost/3050:C:\\BANCO KENDA.FDB";
    final private String USUARIO = "sysdba";
    final private String SENHA = "masterkey";
    
    public Connection getConnection(){
        
        FileReader arq = null;
        
        try {
            
            arq = new FileReader("Caminho do Banco.txt");
            BufferedReader lerArq = new BufferedReader(arq);
 
            URL = lerArq.readLine();
            
            Class.forName("org.firebirdsql.jdbc.FBDriver");
            
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        
        } catch (SQLException | ClassNotFoundException | FileNotFoundException ex) {
            throw new RuntimeException("Erro:\n" + ex);
        } catch (IOException ex) {
            throw new RuntimeException("Erro:\n" + ex);
        } finally {
            try {
                arq.close();
            } catch (IOException ex) {
                throw new RuntimeException("Erro:\n" + ex);
            }
        }
        
    }
    
}
