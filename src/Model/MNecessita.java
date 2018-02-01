/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
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
    private int qtdMateriaPrima;
    private int codigoMateriaPrima;
    
    private Connection con;
    
    public MNecessita(int codigoTinta, int qtd_materia_prima, int codigoMateriaPrima) {
        this.codigoTinta = codigoTinta;
        this.qtdMateriaPrima = qtd_materia_prima;
        this.codigoMateriaPrima = codigoMateriaPrima;
    }
    
    public MNecessita() {
        
    }

    public int getCodigoTinta() {
        return codigoTinta;
    }

    public void setCodigoTinta(int codigoTinta) {
        this.codigoTinta = codigoTinta;
    }

    public int getQtdMateriaPrima() {
        return qtdMateriaPrima;
    }

    public void setQtdMateriaPrima(int qtdMateriaPrima) {
        this.qtdMateriaPrima = qtdMateriaPrima;
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
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigoTinta); //strings /\
            pstmt.setInt(2,codigoMateriaPrima);
            pstmt.setInt(3,qtdMateriaPrima);
            
            pstmt.executeUpdate();
            
           
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao adicionar Necessita\n" + ex);
            
        }   
        
    }
    
    public void deletar(String por){
    
        PreparedStatement pstmt = null;
        int cod = 0;
        
        if(por.equals("tinta")){
            por = "cod_tinta";
            cod = codigoTinta;
        }else if(por.equals("materia prima")){
            por = "cod_materia_prima";
            cod = codigoMateriaPrima;
        }else{
            System.err.println("Parametro incorreto: (tinta) ou (materia prima)");
            return;
        }
        
        String sql1 = "DELETE FROM necessita WHERE ? = ?";
     
        // banco 
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setString(1, por);
            pstmt.setInt(2, cod);
            
            pstmt.executeUpdate();
       
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao deletar Necessita\n" + ex);
            
        }   
        
    }
    
     public void alterar(String por){
    
        PreparedStatement pstmt = null;
        
        int cod = 0;
        
        if(por.equals("tinta")){
            por = "cod_tinta";
            cod = codigoTinta;
        }else if(por.equals("materia prima")){
            por = "cod_materia_prima";
            cod = codigoMateriaPrima;
        }else{
            System.err.println("Parametro incorreto: (tinta) ou (materia prima)");
            return;
        }
        
        try {
                    
            
            String sql1 = "UPDATE NECESSITA SET qtd_materia_prima=? WHERE ? = ?";

            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            
            pstmt.setInt(1,qtdMateriaPrima);
            pstmt.setString(2,por);
            pstmt.setInt(3,cod);
           
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao alterar Necessita\n" + ex);
            
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
