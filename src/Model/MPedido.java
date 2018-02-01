/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public MPedido(Date data, String situacao, int codFunc, int codigo, int codCli, int codOS, String descricao, double custo) {
        this.data = data;
        this.situacao = situacao;
        this.codFunc = codFunc;
        this.codigo = codigo;
        this.codCli = codCli;
        this.codOS = codOS;
        this.descricao = descricao;
        this.custo = custo;
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

    public MPedido() {
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
    
    public ArrayList<MPedido> listar(){
        
        ArrayList<MPedido> pedidos = new ArrayList<>();
        String sql="SELECT * FROM PEDIDO";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                
                Date data1 = rs.getDate("data");
                String situacao1 = rs.getString("situacao");
                int codFunc1 = rs.getInt("cod_funcionario");
                int codigo1 = rs.getInt("cod");
                int codCli1 = rs.getInt("cod_CLI");
                int codOS1 = rs.getInt("cod_OS");
                String descricao1 = rs.getString("descricao");
                Double custo1 = rs.getDouble("custo");
                
                
                MPedido u1 = new MPedido(data1, situacao1, codFunc1, codigo1, codCli1, codOS1, descricao1, custo1);
                pedidos.add(u1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Pedido\n" + ex);
        }
        
        return pedidos;
        
    }
   
   
}
