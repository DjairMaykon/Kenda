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
 * @author JFelipe
 */
public class MProducao {
    
    private Date data;
    private String situacao;
    private int codigoPedido;
    private int codigoFuncionario;
    private double custo;
    private int codigo;
    
    private Connection con =null;
    
    public MProducao() {
    
    }

    public MProducao(Date data, String situacao, int codigoPedido, int codigoFuncionario, double custo, int codigo) {
        this.data = data;
        this.situacao = situacao;
        this.codigoPedido = codigoPedido;
        this.codigoFuncionario = codigoFuncionario;
        this.custo = custo;
        this.codigo = codigo;
    }

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

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
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
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            
            pstmt.setInt(1,codigo);
            pstmt.setDate(2,data);
            pstmt.setDouble(3,custo);
            pstmt.setInt(4,codigoPedido);
            pstmt.setInt(5,codigoFuncionario);
            pstmt.setString(6,situacao);
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar Producao/n" + ex);
        }
        
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM PRODUCAO WHERE COD=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            
            pstmt.setInt(1,codigo);
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar Producao/n" + ex);
        }
        
    }
    
    
    public void alterar(){
        PreparedStatement pstmt = null;
        String sql=" UPDATE PRODUCAO DATA=?, CUSTO=?, COD_PEDIDO=?, COD_FUNCIONARIO=?, SITUACAO=? WHERE COD=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setDate(1,data);
            pstmt.setDouble(2,custo);
            pstmt.setInt(3, codigoPedido);
            pstmt.setInt(4,codigoFuncionario);
            pstmt.setString(5,situacao);
            pstmt.setInt(6, codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar Producao/n" + ex);
        }
        
    }   
    
    public ArrayList<MProducao> listar(){
        
        ArrayList<MProducao> produzem = new ArrayList<>();
        String sql="SELECT * FROM PRODUCAO";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                
                Date data1 = rs.getDate("data");
                String situacao1 = rs.getString("situacao");
                int codigoPedido1 = rs.getInt("cod_pedido");
                int codigoFuncionario1 = rs.getInt("cod_funcionario");
                double custo1 = rs.getDouble("custo");
                int codigo1 = rs.getInt("cod");
                
                MProducao u1 = new MProducao(data1, situacao1, codigoPedido1, codigoFuncionario1, custo1, codigo1);
                produzem.add(u1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Producao\n" + ex);
        }
        
        return produzem;
        
    }
}
