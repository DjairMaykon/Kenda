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
public class MFaz {
    
    private int codigoProducao;
    private int codigoTinta;
    private int qtd;
    
    private Connection con =null;

    public MFaz(int codigoProducao, int codigoTinta, int qtd) {
        this.codigoProducao = codigoProducao;
        this.codigoTinta = codigoTinta;
        this.qtd = qtd;
    }

    public MFaz() {
    }

    public int getCodigoProducao() {
        return codigoProducao;
    }

    public void setCodigoProducao(int codigoProducao) {
        this.codigoProducao = codigoProducao;
    }

    public int getCodigoTinta() {
        return codigoTinta;
    }

    public void setCodigoTinta(int codigoTinta) {
        this.codigoTinta = codigoTinta;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public void adicionar(){
        
        PreparedStatement pstmt = null;
        String sql="INSERT INTO FAZ(COD_PRODUCAO, COD_TINTA, QTD) VALUES(?,?,?)";
        try {   
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigoProducao);
            pstmt.setInt(2,codigoTinta);
            pstmt.setInt(3,qtd);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar Faz:\n"+ex);
        }
        
    }
    
    public void deletar(String por){
        
        PreparedStatement pstmt = null;
        String sql="DELETE FROM FAZ WHERE ?=? ";
        
        int cod = 0;
        
        if(por.equals("troducao")){
            por = "cod_troducao";
            cod = codigoProducao;
        }else if(por.equals("tinta")){
            por = "cod_tinta";
            cod = codigoTinta;
        }else{
            System.err.println("Parametro incorreto: (producao) ou (tinta)");
            return;
        }
        
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1, por);
            pstmt.setInt(2,cod);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir Faz:\n"+ex);
        }
        
    }
    
    
    public void alterar(String por){
        PreparedStatement pstmt = null;
        String sql=" UPDATE FROM FAZ QTD=? WHERE ?=? ";
        
        int cod = 0;
        
        if(por.equals("troducao")){
            por = "cod_troducao";
            cod = codigoProducao;
        }else if(por.equals("tinta")){
            por = "cod_tinta";
            cod = codigoTinta;
        }else{
            System.err.println("Parametro incorreto: (producao) ou (tinta)");
            return;
        }
        
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigoTinta);
            pstmt.setInt(2,qtd);
            pstmt.setString(3, por);
            pstmt.setInt(4,cod);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar Faz:\n"+ex);
        }
        
    }
    
    public ArrayList<MFaz> listar(){
        
        ArrayList<MFaz> faz = new ArrayList<>();
        String sql="SELECT * FROM FAZ";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                
                int codigoProducao1 = rs.getInt("cod_producao");
                int codigoTinta1 = rs.getInt("cod_tinta");
                int qtd1 = rs.getInt("qtd");
                
                MFaz u1 = new MFaz(codigoProducao1, codigoTinta1, qtd1);
                faz.add(u1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Faz\n" + ex);
        }
        
        return faz;
        
    }
}
