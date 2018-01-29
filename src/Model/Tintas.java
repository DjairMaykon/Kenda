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
 * @author Kaione
 */
public class Tintas {

    private String funcionalidade;
    private int codigo;
    private String cor;
    private double custo;
    private Connection con;

    public String getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public int getCodTinta() {
        return codigo;
    }

    public void setCodTinta(int codTinta) {
        this.codigo = codTinta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    
     public void adicionar(){
    
        PreparedStatement pstmt = null;
        
        String sql = "INSERT INTO TINTAS (cod, funcionalide, custo, cor) VALUES(?,?,?,?)"; // banco
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
        
            pstmt.setInt(1, codigo); //strings /\
            pstmt.setString(2,funcionalidade);
            pstmt.setString(4, cor);
            pstmt.setDouble(3, custo);
            
            pstmt.executeUpdate();
            
           
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao adicionar Tintas\n" + ex);
            
        }   
        
    }
    
    public void deletar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "DELETE FROM tintas WHERE cod = ?";
     
        // banco 
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigo);
            
            pstmt.executeUpdate();
       
            
            
            
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao deletar Tintas\n" + ex);
            
        }   
        
    }
    
     public void alterar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "UPDATE TINTAS SET funcionalide=?, custo=?, cor=? WHERE cod = ?";
     
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
           //strings /\
            pstmt.setInt(4, codigo); //strings /\
            pstmt.setString(1,funcionalidade);
            pstmt.setString(3, cor);
            pstmt.setDouble(2, custo);
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao alterar Tintas\n" + ex);
            
        }   
        
    }
    

   
}
