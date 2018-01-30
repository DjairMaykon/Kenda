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

    public MFaz(int codigoProducao, int codigoTinta, int qtd) {
        this.codigoProducao = codigoProducao;
        this.codigoTinta = codigoTinta;
        this.qtd = qtd;
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
            System.out.println("Erro ao adicionar");
        }
        
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM FAZ WHERE COD_PRODUCAO=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigoProducao);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir");
        }
        
    }
    
    
    public void alterar(){
        PreparedStatement pstmt = null;
        String sql=" UPDATE FROM FAZ COD_TINTA=?, QTD=? WHERE COD_PRODUCAO=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigoTinta);
            pstmt.setInt(2,qtd);
            pstmt.setInt(3,codigoProducao);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar");
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
