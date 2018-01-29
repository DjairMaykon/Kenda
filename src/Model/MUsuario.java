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
public class MUsuario {  
    
    private String login;
    private String senha;
    private int nivelDeAcesso;
    private Connection con = null;

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
        
        String sql="INSERT INTO usuario(login, senha, nivel_de_acesso) VALUES(?,?,?)";
        PreparedStatement pstmt = null;
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,login);
            pstmt.setString(2,senha);
            pstmt.setInt(3,nivelDeAcesso);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar Usuário:\n"+ex);
        }
        
    }
    
    public void deletar(){
        
        String sql="DELETE FROM usuario WHERE login=? ";
        PreparedStatement pstmt = null;
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,login);
            pstmt.executeUpdate();
            
        }catch (SQLException ex) {
            System.out.println("Erro ao deletar Usuário\n" + ex);
        }
        
    }
    
    
    public void alterar(){
        
        String sql=" UPDATE USUARIO SET  SENHA=?, NIVEL_DE_ACESSO=? WHERE LOGIN=? ";
        PreparedStatement pstmt = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,senha);
            pstmt.setInt(2,nivelDeAcesso);
            pstmt.setString(3, login);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar Usuario\n" + ex);
        }
     
    
}
    
}