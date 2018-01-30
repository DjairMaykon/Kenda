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
 * @author Kaione
 */
public class MEndereco {
    private String cep; 
    private String uf;
    private String cidade;
    private String bairro;
    private int codigo;
    private String rua;
    private int numero;
    private Connection con = null;

    public MEndereco(String cep, String uf, String cidade, String bairro, int codigo, String rua, int numero) {
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.codigo = codigo;
        this.rua = rua;
        this.numero = numero;
    }
    

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
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,uf);
            pstmt.setString(2,cidade);
            pstmt.setString(3,rua);
            pstmt.setInt(5,numero);
            pstmt.setString(6,bairro);
            pstmt.setString(7,cep);
            pstmt.setInt(4,codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar");
        }
        
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM ENDERECO WHERE COD=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir");
        }
        
    }
    
    
    public void alterar(){
        PreparedStatement pstmt = null;
        String sql=" UPDATE ENDERECO SET UF=?, CIDADE=?, RUA=?, NUMERO=?, BAIRRO=?,CEP=? WHERE COD=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,uf);
            pstmt.setString(2,cidade);
            pstmt.setString(3,rua);
            pstmt.setInt(4,numero);
            pstmt.setString(5,bairro);
            pstmt.setString(6,cep);
            pstmt.setInt(7, codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar");
        }
        
    }
    
    public ArrayList<MEndereco> listar(){
        
        ArrayList<MEndereco> enderecos = new ArrayList<>();
        String sql="SELECT * FROM ENDERECO";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                
                String cep1 = rs.getString("cep");
                String uf1 = rs.getString("uf");
                String cidade1 = rs.getString("cidade");
                String bairro1 = rs.getString("bairro");
                int codigo1 = rs.getInt("cod");
                String rua1 = rs.getString("rua");
                int numero1 = rs.getInt("numero");
                
                MEndereco u1 = new MEndereco(cep1, uf1, cidade1, bairro1, codigo1, rua1, numero1);
                enderecos.add(u1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar Endereco\n" + ex);
        }
        
        return enderecos;
        
    }
   
    
}
