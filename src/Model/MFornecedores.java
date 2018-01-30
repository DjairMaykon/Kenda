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
public class MFornecedores {
    
    private int codigo;
    private String email;
    private String site;
    private String nome;
    private String cnpj;
    private String telefone;
    private int codigoEndereco;
    private Connection con;

    public MFornecedores(int codigo, String email, String site, String nome, String cnpj, String telefone, int codigoEndereco) {
        
        this.codigo = codigo;
        this.email = email;
        this.site = site;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.codigoEndereco = codigoEndereco;
    }

    public MFornecedores() {
    
    }
    
    public int getCodigo() {
        return codigo;
    }
    
    public int getCodigoEndereco() {
        return codigoEndereco;
    }

    public void setCodigoEndereco(int codigoEndereco) {
        this.codigoEndereco = codigoEndereco;
    }

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

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void adicionar(){
    
        PreparedStatement pstmt = null;
        
        String sql = "INSERT INTO fornecedores(cod, cod_end, email, site, nome, cnpj, telefone) VALUES(?,?,?,?,?,?,?)"; // banco
        
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
     
    public ArrayList<MFornecedores> listar(){
        
        ArrayList<MFornecedores> fornecedores = null;
        String sql="SELECT * FROM FORNECEDORES";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            fornecedores = new ArrayList<>();
            
            while(rs.next()){
                
                int codigo1 = rs.getInt("cod");
                String email1 = rs.getString("email");
                String site1 = rs.getString("site");
                String nome1 = rs.getString("nome");
                String cnpj1 = rs.getString("cnpj");
                String telefone1 = rs.getString("telefone");
                int codigoEndereco1 = rs.getInt("cod_end");
                
                MFornecedores f1 = new MFornecedores(codigo1, email1, site1, nome1, cnpj1, telefone1, codigoEndereco1);
                fornecedores.add(f1);
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Usuario\n" + ex);
        }
        
        return fornecedores;
        
    }
    
}
