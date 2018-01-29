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
public class MPedido {
    
    private Connection con = null;
    private Date data; 
    private String situacao;
    private int codFunc;
    private int codigo;
    private int codCli;
    private int codOS;
    private String descricao;
    private double custo;

    public Date getData() {
        return data;
    }

    public void setDataPed(Date data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(int codFunc) {
        this.codFunc = codFunc;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodCli() {
        return codCli;
    }

    public void setCodCli(int codCli) {
        this.codCli = codCli;
    }

    public int getCodOS() {
        return codOS;
    }

    public void setCodOS(int codOS) {
        this.codOS = codOS;
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
        String sql="INSERT INTO PEDIDO(COD, CUSTO, SITUACAO, DATA, COD_CLI, COD_OS, COD_FUNCIONARIO, DESCRICAO) VALUES(?,?,?,?,?,?,?,?)";
        try {   
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigo);
            pstmt.setDouble(2,custo);
            pstmt.setString(3,situacao);
            pstmt.setDate(4,data);
            pstmt.setInt(5,codCli);
            pstmt.setInt(6,codOS);
            pstmt.setInt(7,codFunc);
            pstmt.setString(8, descricao);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar Pedido\n"+ex);
        }
        
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM PEDIDO WHERE COD=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar Pedido\n"+ex);
        }
        
    }
    
    
    public void alterar(){
        PreparedStatement pstmt = null;
        String sql=" UPDATE PEDIDO SET CUSTO=?, SITUACAO=?, DATA=?, COD_CLI=?, COD_OS=?, COD_FUNCIONARIO=?, DESCRICAO=? WHERE COD=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(8,codigo);
            pstmt.setDouble(1,custo);
            pstmt.setString(2,situacao);
            pstmt.setDate(3,data);
            pstmt.setInt(4,codCli);
            pstmt.setInt(5,codOS);
            pstmt.setInt(6,codFunc);
            pstmt.setString(7, descricao);
        
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar Pedido\n"+ex);
        }
        
    }
   
   
}
