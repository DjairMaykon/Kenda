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
public class Necessita {
    private int codigoTinta;
    private int qtd_materia_prima;
    private int codigoMateriaPrima;
    private Connection con;

    public int getCodigoTinta() {
        return codigoTinta;
    }

    public void setCodigoTinta(int codigoTinta) {
        this.codigoTinta = codigoTinta;
    }

    public int getQtd_materia_prima() {
        return qtd_materia_prima;
    }

    public void setQtd_materia_prima(int qtd_materia_prima) {
        this.qtd_materia_prima = qtd_materia_prima;
    }

    public int getCodigoMateriaPrima() {
        return codigoMateriaPrima;
    }

    public void setCodigoMateriaPrima(int codigoMateriaPrima) {
        this.codigoMateriaPrima = codigoMateriaPrima;
    }

    public void adicionar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "INSERT INTO NECESSITA (cod_tinta, cod_materia_prima, qtd_materia_prima) VALUES(?,?,?)";
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigoTinta); //strings /\
            pstmt.setInt(2,codigoMateriaPrima);
            pstmt.setInt(3,qtd_materia_prima);
            pstmt.executeUpdate();
            
           
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
    
    public void deletar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "DELETE FROM necessita WHERE cod_tinta = ?";
     
        // banco 
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigoTinta);
            
            pstmt.executeUpdate();
       
            
            
            
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO DELETAR\n" + ex);
            
        }   
        
    }
    
     public void update(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "UPDATE FROM NECESSITA SET cod_tinta=?, cod_materia_prima=?, qtd_materia_prima WHERE cod = ?";
     
        
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
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
}
