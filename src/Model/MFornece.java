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
public class MFornece {
    
    private int codigoFornecedores;
    private int codigoMateriaPrima;
    private double custo;
    
    private Connection con;

    public MFornece() {
    
    }
    
    public MFornece(int codigoFornecedores, int codigoMateriaPrima, double custo) {
        this.codigoFornecedores = codigoFornecedores;
        this.codigoMateriaPrima = codigoMateriaPrima;
        this.custo = custo;
    }

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
            
            throw new RuntimeException("Erro ao adicionar Fornece:\n" + ex);
            
        }   
        
    }
    
    public void deletar(String por){
    
        PreparedStatement pstmt = null;
        String sql1 = "DELETE FROM FORNECE WHERE ? = ?";
     
        int cod = 0;
        
        if(por.equals("fornecedores")){
            por = "cod_fornecedores";
            cod = codigoFornecedores;
        }else if(por.equals("materia prima")){
            por = "cod_materia_prima";
            cod = codigoMateriaPrima;
        }else{
            System.err.println("Parametro incorreto: (fornecedores) ou (materia prima)");
            return;
        }
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setString(1, por);
            pstmt.setInt(2, cod);
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao deletar Fornece:\n" + ex);
            
        }   
        
    }
    
     public void alterar(String por){
    
        PreparedStatement pstmt = null;
        
        int cod = 0;
        
        if(por.equals("fornecedores")){
            por = "cod_fornecedores";
            cod = codigoFornecedores;
        }else if(por.equals("materia prima")){
            por = "cod_materia_prima";
            cod = codigoMateriaPrima;
        }else{
            System.err.println("Parametro incorreto: (fornecedores) ou (materia prima)");
            return;
        }
        
        try {
                    
            
            String sql1 = "UPDATE FORNECE SET custo=? WHERE ? = ?";

            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
           //strings /\
            pstmt.setDouble(1,custo);
            pstmt.setString(2, por);
            pstmt.setInt(3, cod);
           
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao alterar Fornece\n" + ex);
            
        }   
        
    }
     
     public ArrayList<MFornece> listar(){
        
        ArrayList<MFornece> fornecem = new ArrayList<>();
        String sql="SELECT * FROM FORNECE";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                
                int codigoFornecedores1 = rs.getInt("cod_fornecedores");
                int codigoMateriaPrima1 = rs.getInt("cod_materia_prima");
                Double custo1 = rs.getDouble("custo");
                
                MFornece u1 = new MFornece(codigoFornecedores1, codigoMateriaPrima1, custo1);
                fornecem.add(u1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Fornece\n" + ex);
        }
        
        return fornecem;
        
    }
}
