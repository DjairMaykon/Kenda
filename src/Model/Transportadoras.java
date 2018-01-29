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
public class Transportadoras {
    private Connection con = null;
    private String nome;
    private int codEnd;
    private String cnpj;
    private int codigo;
    private String unidadeDoFrete;
    private String telefone;
    private double frete;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodEnd() {
        return codEnd;
    }

    public void setCodEnd(int codEnd) {
        this.codEnd = codEnd;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getUnidadeDoFrete() {
        return unidadeDoFrete;
    }

    public void setUnidadeDoFrete(String unidadeDoFrete) {
        this.unidadeDoFrete = unidadeDoFrete;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }
        public void adicionar(){
        
        PreparedStatement pstmt = null;
        String sql="INSERT INTO TRANSPORTADORAS(COD, TELEFONE, COD_END, FRETE, NOME, CNPJ, UNIDADE_DO_FRETE) VALUES(?,?,?,?,?,?,?)";
        try {   
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(2,telefone);
            pstmt.setDouble(4,frete);
            pstmt.setString(5,nome);
            pstmt.setInt(1,codigo);
            pstmt.setString(6,cnpj);
            pstmt.setString(7,unidadeDoFrete);
            pstmt.setInt(3,codEnd);
            pstmt.executeQuery();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar");
        }
        
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM TRANSPORTADORAS WHERE COD=? ";
        try {
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigo);
            pstmt.executeQuery();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir");
        }
        
    }
    
    
    public void alterar(){
        PreparedStatement pstmt = null;
        String sql=" UPDATE FROM TRANSPORTADORAS SET UNIDADE_DO_FRETE=?, TELEFONE=?, COD_END=?, FRETE=?, NOME=?, CNPJ=? WHERE COD=? ";
        try {
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,unidadeDoFrete);
            pstmt.setString(2,telefone);
            pstmt.setInt(3, codEnd);
            pstmt.setDouble(4,frete);
            pstmt.setString(5,nome);
            pstmt.setString(6,cnpj);
            pstmt.setInt(7, codigo);
            pstmt.executeQuery();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar");
        }
        
    }


    
        

    
}
