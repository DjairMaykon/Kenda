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
 * @author JFelipe
 */
public class Producao {
    private Connection con =null;
    private Date data;
    private String situacao;
    private int codigoPedido;
    private int codigoFuncionario;
    private int custo;
    private int codigo;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getCodigoPedido() {
        return codigoPedido;
    }

    public void setCodigoPedido(int codigoPedido) {
        this.codigoPedido = codigoPedido;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public int getCusto() {
        return custo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
     public void adicionar(){
        
        PreparedStatement pstmt = null;
        String sql="INSERT INTO PRODUCAO(COD, DATA, CUSTO, COD_PEDIDO, COD_FUNCIONARIO, SITUACAO) VALUES(?,?,?,?,?,?)";
        try {   
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigo);
            pstmt.setDate(2,data);
            pstmt.setDouble(3,custo);
            pstmt.setInt(4,codigoPedido);
            pstmt.setInt(5,codigoFuncionario);
            pstmt.setString(7,situacao);
            pstmt.executeQuery();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar");
        }
        
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM PRODUCAO WHERE COD=? ";
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
        String sql=" UPDATE FROM PRODUCAO DATA=?, CUSTO=?, COD_PEDIDO=?, COD_FUNCIONARIO=?, SITUACAO=? WHERE COD=? ";
        try {
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setDate(1,data);
            pstmt.setDouble(2,custo);
            pstmt.setInt(3, codigoPedido);
            pstmt.setString(5,situacao);
            pstmt.setInt(6,codigo);
            pstmt.setInt(7, codigo);
            pstmt.executeQuery();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar");
        }
        
    }   
}
