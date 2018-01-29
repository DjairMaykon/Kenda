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
public class MTransportadoras {
    
    private String nome;
    private int codEnd;
    private String cnpj;
    private int codigo;
    private String unidadeDoFrete;
    private String telefone;
    private double frete;
    private Connection con = null;

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
    
        String sql="INSERT INTO TRANSPORTADORAS(COD, TELEFONE, COD_END, FRETE, NOME, CNPJ, UNIDADE_DO_FRETE) VALUES(?,?,?,?,?,?,?)";
        PreparedStatement pstmt = null;
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(2,telefone);
            pstmt.setDouble(4,frete);
            pstmt.setString(5,nome);
            pstmt.setInt(1,codigo);
            pstmt.setString(6,cnpj);
            pstmt.setString(7,unidadeDoFrete);
            pstmt.setInt(3,codEnd);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar Transportadora\n" + ex);
        }
        
    }
    
    public void deletar(){
        
        String sql="DELETE FROM TRANSPORTADORAS WHERE COD=? ";
        PreparedStatement pstmt = null;
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar Transportadora\n" + ex);
        }
        
    }
    
    
    public void alterar(){
        
        String sql=" UPDATE TRANSPORTADORAS SET UNIDADE_DO_FRETE=?, TELEFONE=?, COD_END=?, FRETE=?, NOME=?, CNPJ=? WHERE COD=? ";
        PreparedStatement pstmt = null;
        
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,unidadeDoFrete);
            pstmt.setString(2,telefone);
            pstmt.setInt(3, codEnd);
            pstmt.setDouble(4,frete);
            pstmt.setString(5,nome);
            pstmt.setString(6,cnpj);
            pstmt.setInt(7, codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar Transportadora\n" + ex);
        }
        
    }


    
        

    
}
