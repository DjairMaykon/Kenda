/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author JFelipe
 */
public class Usuario {  
    private Connection con = null;
    private String login;
    private String senha;
    private int nivelDeAcesso;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNivelDeAcesso() {
        return nivelDeAcesso;
    }

    public void setNivelDeAcesso(int nivelDeAcesso) {
        this.nivelDeAcesso = nivelDeAcesso;
    }
    
    
    public void adicionar(){
        
        PreparedStatement pstmt = null;
        String sql="INSERT INTO USUARIO(LOGIN, SENHA, NIVEL_DE_ACESSO) VALUES(?,?,?)";
        try {
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,login);
            pstmt.setString(2,senha);
            pstmt.setInt(3,nivelDeAcesso);
            pstmt.executeQuery();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar");
        }
        
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM USUARIO WHERE LOGIN=? ";
        try {
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,login);
            pstmt.executeQuery();
            
        }catch (SQLException ex) {
            System.out.println("Erro ao excluir");
        }
        
    }
    
    
    public void alterar(){
        PreparedStatement pstmt = null;
        String sql=" UPDATE FROM USUARIO SET  SENHA=?, NIVEL_DE_ACESSO=? WHERE LOGIN=? ";
        try {
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,senha);
            pstmt.setInt(2,nivelDeAcesso);
            pstmt.setString(3, login);
            pstmt.executeQuery();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar");
        }
     
    
}
    
}