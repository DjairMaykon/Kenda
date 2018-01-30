/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author JFelipe
 */
public class MNecessita {
    private int codigoTinta;
    private int qtd_materia_prima;
    private int codigoMateriaPrima;
    private Connection con;

    public MNecessita() {
        
    }

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

    public MNecessita(int codigoTinta, int qtd_materia_prima, int codigoMateriaPrima) {
        this.codigoTinta = codigoTinta;
        this.qtd_materia_prima = qtd_materia_prima;
        this.codigoMateriaPrima = codigoMateriaPrima;
    }

    public void setCodigoMateriaPrima(int codigoMateriaPrima) {
        this.codigoMateriaPrima = codigoMateriaPrima;
    }

    public void adicionar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "INSERT INTO NECESSITA (cod_tinta, cod_materia_prima, qtd_materia_prima) VALUES(?,?,?)";
        
        try {
            
            con = new MConnectionFactory().getConnection();
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
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigoTinta);
            
            pstmt.executeUpdate();
       
            
            
            
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO DELETAR\n" + ex);
            
        }   
        
    }
    
     public void alterar(){
    
        PreparedStatement pstmt = null;
        
     
        
        try {
                    
            
            String sql1 = "UPDATE NECESSITA SET qtd_materia_prima=? WHERE cod_tinta = ?";

            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
           //strings /\
            pstmt.setInt(1,qtd_materia_prima);
            pstmt.setInt(2,codigoTinta);//strings /\
           
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO ao alterar\n" + ex);
            
        }   
        
    }
     
     public ArrayList<MNecessita> listar(){
        
        ArrayList<MNecessita> necessitam = new ArrayList<>();
        String sql="SELECT * FROM NECESSITA";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                
                int codigoTinta1 = rs.getInt("cod_tinta");
                int qtd_materia_prima1 = rs.getInt("cod_materia_prima");
                int codigoMateriaPrima1 = rs.getInt("qtd_materia_prima");
                
                
                MNecessita u1 = new MNecessita(codigoTinta1, qtd_materia_prima1, codigoMateriaPrima1);
                necessitam.add(u1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Necessita\n" + ex);
        }
        
        return necessitam;
        
    }
}
