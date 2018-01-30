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
public class MHistoricoDeAvaliacao {
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

    public MHistoricoDeAvaliacao(int codigo, int codigoTinta, int codigoFuncionario, String avalicao, Date data) {
        this.codigo = codigo;
        this.codigoTinta = codigoTinta;
        this.codigoFuncionario = codigoFuncionario;
        this.avalicao = avalicao;
        this.data = data;
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
            con = new MConnectionFactory().getConnection();
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
        String sql=" UPDATE historico_de_avaliacao cod_tinta=?, cod_funcionario=?, avaliacao=?, data=? WHERE cod=? ";
        try {
            con = new MConnectionFactory().getConnection();
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
    
    public ArrayList<MHistoricoDeAvaliacao> listar(){
        
        ArrayList<MHistoricoDeAvaliacao> historicos = new ArrayList<>();
        String sql="SELECT * FROM HISTORICO_DE_AVALIACAO";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                
                int codigo1 = rs.getInt("cod");
                int codigoTinta1 = rs.getInt("cod_tinta");
                int codigoFuncionario1 = rs.getInt("cod_funcionario");
                String avalicao1 = rs.getString("avaliacao");
                Date data1 = rs.getDate("data");
                
                MHistoricoDeAvaliacao u1 = new MHistoricoDeAvaliacao(codigo1, codigoTinta1, codigoFuncionario1, avalicao1, data1);
                historicos.add(u1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar HistoricoDeAvaliacao\n" + ex);
        }
        
        return historicos;
        
    }
}
