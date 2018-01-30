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
public class MCliente {
    private int codigo;
    private String telefone  ;
    private String email;
    private int codigoEndereco;
    private String nome;
    private String cnpj;
    private Connection con;

    public MCliente() {
        this.con = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo_cliente(int codigo) {
        this.codigo = codigo;
    }

    public String getTelefone() {
        return telefone;
    }

    public MCliente(int codigo, String telefone, String email, int codigoEndereco, String nome, String cnpj) {
        this.codigo = codigo;
        this.telefone = telefone;
        this.email = email;
        this.codigoEndereco = codigoEndereco;
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCodigoEndereco() {
        return codigoEndereco;
    }

    public void setCodigoEndereco(int codigoendereco) {
        this.codigoEndereco = codigoendereco;
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
    
    public void adicionar(){
    
        PreparedStatement pstmt = null;
        
        String sql = "INSERT INTO cliente(cod, telefone, email, cod_end, nome, cnpj) VALUES(?,?,?,?,?,?)"; // banco
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
        
            pstmt.setInt(1, codigo); //strings /\
            pstmt.setString(2, telefone);
            pstmt.setString(3, email);
            pstmt.setInt(4, codigoEndereco);
            pstmt.setString(5, nome);
            pstmt.setString(6, cnpj);
            
            pstmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
    
    public void deletar(){
    
        PreparedStatement pstmt = null;
        
        String sql = "DELETE FROM cliente WHERE cod = ?"; // banco 
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
        
            pstmt.setInt(1, codigo);
            
            pstmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
    
     public void update(){
    
        PreparedStatement pstmt = null;
        
        String sql = "UPDATE cliente SET telefone=?, email=?, cod_end=?, nome=?, cnpj=? WHERE cod = ?"; // banco 
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
        
            pstmt.setString(1, telefone);
            pstmt.setString(2, email);
            pstmt.setInt(3, codigoEndereco);
            pstmt.setString(4, nome);
            pstmt.setString(5, cnpj);
            pstmt.setInt(6, codigo);
            
            pstmt.executeUpdate();
            
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
     
     public ArrayList<MCliente> listar(){
        
        ArrayList<MCliente> clientes = null;
        String sql="SELECT * FROM CLIENTE";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            clientes = new ArrayList<>();
            while(rs.next()){
                
                int codigo1 = rs.getInt("cod");
                String telefone1 = rs.getString("telefone");
                String email1 = rs.getString("email");
                int codigoEndereco1 = rs.getInt("cod_end");
                String nome1 = rs.getString("nome");
                String cnpj1 = rs.getString("cnpj");
                
                System.out.println(""+codigo1);
                
                MCliente a1 = new MCliente(codigo1, telefone1, email1, codigoEndereco1, nome1, cnpj1);
                clientes.add(a1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar Cliente\n" + ex);
        }
        
        return clientes;
        
    }
    
}
