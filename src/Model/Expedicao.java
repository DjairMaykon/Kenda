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
public class Expedicao {
    private Date dataEntra;
    private Date dataSai; 
    private String situacao;
    private int codigo;
    private int codPed;
    private int codTransp;
    private String descricao;
    private double custo;
    private Connection con;

    public Date getDataEntra() {
        return dataEntra;
    }

    public void setDataEntra(Date dataEntra) {
        this.dataEntra = dataEntra;
    }

    public Date getDataSai() {
        return dataSai;
    }

    public void setDataSai(Date dataSai) {
        this.dataSai = dataSai;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getCodExped() {
        return codigo;
    }

    public void setCodExped(int codExped) {
        this.codigo = codExped;
    }

    public int getCodPed() {
        return codPed;
    }

    public void setCodPed(int codPed) {
        this.codPed = codPed;
    }

    public int getCodTransp() {
        return codTransp;
    }

    public void setCodTransp(int codTransp) {
        this.codTransp = codTransp;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    
    
    public void adicionar(){
    
        PreparedStatement pstmt = null;
        
        String sql = "INSERT INTO ESPEDICAO(cod, custo, cod_pedido, cod_transportadoras, descricao, data_de_saida, data_de_entrega,situacao) VALUES(?,?,?,?,?,?,?,?)"; // banco
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
        
            pstmt.setInt(1, codigo); //strings /\
            pstmt.setDouble(2, custo);
            pstmt.setInt(3, codPed);
            pstmt.setInt(4, codTransp);
            pstmt.setString(5, descricao);
            pstmt.setDate(6, dataSai);
            pstmt.setDate(7, dataEntra);
            pstmt.setString(5, situacao);
           
            
            
            pstmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
    
    public void deletar(){
    
        PreparedStatement pstmt = null;
        
        String sql = "DELETE FROM ESPEDICAO WHERE cod = ?"; // banco 
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
        
            pstmt.setInt(1, codigo);
            
            pstmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
    
     public void alterar(){
    
        PreparedStatement pstmt = null;
        
        String sql = "UPDATE FROM fornecedores SET custo=?, cod_pedido=?, cod_transportadoras=?, descricao=?, data_de_saida=?, data_de_entrega=?,situacao? where cod=?"; // banco  
        
        try {
            
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
        
           //strings /\
            pstmt.setDouble(1, custo);
            pstmt.setInt(2,codPed);
            pstmt.setInt(3, codTransp);
            pstmt.setString(4, descricao);
            pstmt.setDate(5, dataSai);
            pstmt.setDate(6, dataEntra);
            pstmt.setString(7, situacao);
            pstmt.setInt(8,codigo);
            
            pstmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO Alterar\n" + ex);
            
        }   
        
    }

   
}
