/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class Alocado {
    private int codigoSetor;
    private String funcao;
    private int codigoFuncionario;
    private Connection con;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    
    public void adicionar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "INSERT INTO alocado (cod_setor, cod_funcionario, funcao) VALUES(?,?,?)";
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigoSetor); //strings /\
            pstmt.setInt(2,codigoFuncionario);
            pstmt.setString(3,funcao);
            pstmt.executeUpdate();
            
           
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
    
    public void deletar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "DELETE FROM alocado WHERE cod_funcionario = ?";
     
        // banco 
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigoFuncionario);
            
            pstmt.executeUpdate();
       
            
            
            
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO DELETAR\n" + ex);
            
        }   
        
    }
    
     public void alterar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "UPDATE alocado SET funcao=? WHERE cod_funcionario = ?";
     
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
           //strings /\
            pstmt.setString(1,funcao);
            pstmt.setInt(2,codigoFuncionario);//strings /\
           
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO ao alterar\n" + ex);
            
        }   
        
    }

    
}
