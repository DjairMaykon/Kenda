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
public class MSetor {
    private Connection con = null;
    private String nome;
    private int codigo;
    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
   
    public void adicionar(){
        
        PreparedStatement pstmt = null;
        String sql="INSERT INTO SETOR(COD, DESCRICAO, NOME) VALUES(?,?,?)";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigo);
            pstmt.setString(2,descricao);
            pstmt.setString(3,nome);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar Setor\n" + ex);
        }
        
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM SETOR WHERE COD=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar Setor\n" + ex);
        }
        
    }
    
    
    public void alterar(){
        PreparedStatement pstmt = null;
        String sql=" UPDATE SETOR SET DESCRICAO=?, NOME=? WHERE COD=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,descricao);
            pstmt.setString(2,nome);
            pstmt.setInt(3, codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar Setor\n" + ex);
        }
     
    
    
}
}
