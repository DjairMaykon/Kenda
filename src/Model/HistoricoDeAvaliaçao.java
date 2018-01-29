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
public class HistoricoDeAvaliaçao {
    private int codigo;
   private int codigoTinta;
    private int codigoFuncionario;
    private String avalicao;
    private Date data;
    private Connection con = null;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
 
    public int getCodigoTinta() {
        return codigoTinta;
    }

    public void setCodigoTinta(int codigoTinta) {
        this.codigoTinta = codigoTinta;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }

    public String getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(String avalicao) {
        this.avalicao = avalicao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    public void adicionar(){
        
        PreparedStatement pstmt = null;
        String sql="INSERT INTO historico_de_avaliacao(cod, cod_tinta, cod_funcionario, avaliacao, data) VALUES(?,?,?,?,?)";
        try {   
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigo);
            pstmt.setInt(2,codigoTinta);
            pstmt.setInt(3,codigoFuncionario);
            pstmt.setString(4,avalicao);
            pstmt.setDate(5,data);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar");
        }
        
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM historico_de_avaliacao WHERE cod=? ";
        try {
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao excluir");
        }
        
    }
    
    
    public void alterar(){
        PreparedStatement pstmt = null;
        String sql=" UPDATE historico_de_avaliacao cod_tinta=?, cod_funcionario=?, avaliacao=?, data=? WHERE cod=? ";
        try {
            con = new ConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigoTinta);
            pstmt.setInt(2,codigoFuncionario);
            pstmt.setString(3, avalicao);
            pstmt.setDate(4,data);
            pstmt.setInt(5,codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar");
        }
        
    }
}
