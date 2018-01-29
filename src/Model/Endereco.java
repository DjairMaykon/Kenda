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
 * @author Kaione
 */
public class Endereco {
    private String cep; 
    private String uf;
    private String cidade;
    private String bairro;
    private int codigo;
    private String rua;
    private int numero;
    private Connection con = null;
    

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

  
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void adicionar(){
        
        PreparedStatement pstmt = null;
        String sql="INSERT INTO ENDERECO(UF, CIDADE, RUA, COD, NUMERO, BAIRRO, CEP) VALUES(?,?,?,?,?,?,?)";
        try {
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,uf);
            pstmt.setString(2,cidade);
            pstmt.setString(3,rua);
            pstmt.setInt(5,numero);
            pstmt.setString(6,bairro);
            pstmt.setString(7,cep);
            pstmt.setInt(4,codigo);
            pstmt.executeQuery();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar");
        }
        
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM ENDERECO WHERE COD=? ";
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
        String sql=" UPDATE ENDERECO SET UF=?, CIDADE=?, RUA=?, NUMERO=?, BAIRRO=?,CEP=? WHERE COD=? ";
        try {
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,uf);
            pstmt.setString(2,cidade);
            pstmt.setString(3,rua);
            pstmt.setInt(4,numero);
            pstmt.setString(5,bairro);
            pstmt.setString(6,cep);
            pstmt.setInt(7, codigo);
            pstmt.executeQuery();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar");
        }
        
    }
   
    
}
