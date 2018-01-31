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
public class MFornece {
    private int codigoFornecedores;
    private int codigoMateriaPrima;
    private double custo;
    private Connection con;
    

    public int getCodigoFornecedores() {
        return codigoFornecedores;
    }

    public void setCodigoFornecedores(int codigoFornecedores) {
        this.codigoFornecedores = codigoFornecedores;
    }

    public int getCodigoMateriaPrima() {
        return codigoMateriaPrima;
    }

    public void setCodigoMateriaPrima(int codigoMateriaPrima) {
        this.codigoMateriaPrima = codigoMateriaPrima;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

     public void adicionar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "INSERT INTO FORNECE (cod_fornecedores, cod_materia_prima, custo) VALUES(?,?,?)";
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigoFornecedores); //strings /\
            pstmt.setInt(2,codigoMateriaPrima);
            pstmt.setDouble(3,custo);
            pstmt.executeUpdate();
            
           
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
    
    public void deletar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "DELETE FROM FORNECE WHERE cod_materia_prima = ?";
     
        // banco 
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigoMateriaPrima);
            
            pstmt.executeUpdate();
       
            
            
            
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO DELETAR\n" + ex);
            
        }   
        
    }
    
     public void alterar(){
    
        PreparedStatement pstmt = null;
        
     
        
        try {
                    
            
            String sql1 = "UPDATE FORNECE SET custo=? WHERE cod_materia_prima = ?";

            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
           //strings /\
            pstmt.setDouble(1,custo);
            pstmt.setInt(2,codigoMateriaPrima);//strings /\
           
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO ao alterar\n" + ex);
            
        }   
        
    }
}
