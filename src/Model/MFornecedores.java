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
public class MFornecedores {
    
    private int codigo;
    private String email;
    private String site;
    private String nome;
    private String cnpj;
    private String telefone;
    private int codigoEndereco;
    private Connection con;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    public void adicionar(){
    
        PreparedStatement pstmt = null;
        
        String sql = "INSERT INTO cliente(cod, cod_end, email, site, nome, cnpj, telefone) VALUES(?,?,?,?,?,?,?)"; // banco
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
        
            pstmt.setInt(1, codigo); //strings /\
            pstmt.setInt(2, codigoEndereco);
            pstmt.setString(3, email);
            pstmt.setString(4, site);
            pstmt.setString(5, nome);
            pstmt.setString(6, cnpj);
            pstmt.setString(7, telefone);
            
            pstmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR/n" + ex);
            
        }   
        
    }
    
    public void deletar(){
    
        PreparedStatement pstmt = null;
        
        String sql = "DELETE FROM fornecedores WHERE cod = ?"; // banco 
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
        
            pstmt.setInt(1, codigo);
            
            pstmt.executeUpdate();

        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO Deletar/n" + ex);
            
        }   
        
    }
    
     public void update(){
    
        PreparedStatement pstmt = null;
        
        String sql = "UPDATE fornecedores SET cod_end=?, email=?, site=?, nome=?, cnpj=?, telefone=? WHERE cod = ?"; // banco  
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
        
           //strings /\
            pstmt.setInt(1, codigoEndereco);
            pstmt.setString(2, email);
            pstmt.setString(3, site);
            pstmt.setString(4, nome);
            pstmt.setString(5, cnpj);
            pstmt.setString(6, telefone);
            pstmt.setInt(7, codigo);
            
            pstmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO Alterar/n" + ex);
            
        }   
        
    }
    
}
