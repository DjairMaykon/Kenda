/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
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
    
    
     public void adicionar(int materiaPrimaQtd[][], int qtd){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "INSERT INTO TINTAS (cod, funcionalide, custo, cor) VALUES(?,?,?,?)"; // banco
        String sql2 = "INSERT INTO NECESSITA (cod_tinta, cod_materia_prima, qtd_materia_prima) VALUES(?,?,?)";
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigo); //strings /\
            pstmt.setString(2,funcionalidade);
            pstmt.setString(4, cor);
            pstmt.setDouble(3, custo);
            
            pstmt.executeUpdate();
            
            
            for(int i = 0; i < qtd; i++){
                
                pstmt = con.prepareStatement(sql2);
                pstmt.setInt(1, codigo);
                pstmt.setInt(2, materiaPrimaQtd[i][0]);
                pstmt.setInt(3, materiaPrimaQtd[i][1]);
                pstmt.executeUpdate();
                
            }
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
    
    public void deletar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "DELETE FROM tintas WHERE cod = ?";
        String sql2 = "DELETE FROM necessita WHERE cod_tinta = ?";
        // banco 
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigo);
            
            pstmt.executeUpdate();
            pstmt = con.prepareStatement(sql2);
            pstmt.setInt(1, codigo);
            pstmt.executeUpdate();
            
            
            
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO DELETAR\n" + ex);
            
        }   
        
    }
    
     public void update(int materiaPrimaQtd[][], int qtd){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "UPDATE FROM TINTAS SET funcionalide=?, custo=?, cor=? WHERE cod = ?";
        String sql2 = "UPDATE FROM necessita SET quantidade=? where cod_tinta = ?";// banco  
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
           //strings /\
            pstmt.setInt(4, codigo); //strings /\
            pstmt.setString(1,funcionalidade);
            pstmt.setString(3, cor);
            pstmt.setDouble(2, custo);
            
            pstmt.executeUpdate();
            
            
             for(int i = 0; i < qtd; i++){
                
                pstmt = con.prepareStatement(sql2);
                pstmt.setInt(1, materiaPrimaQtd[i][2]);
                pstmt.setInt(2,codigo);
                pstmt.executeUpdate();
                
            }
            
            
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
    

   
}
