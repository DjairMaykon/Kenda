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
public class MMateriaPrima{
    private Connection con = null;
    private int codigo;
    private String descricao;
    private String nome;
    private double custo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public MMateriaPrima(int codigo, String descricao, String nome, double custo) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.nome = nome;
        this.custo = custo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    
    public void adicionar(){
        
        PreparedStatement pstmt = null;
        String sql="INSERT INTO MATERIA_PRIMA(COD, DESCRICAO, NOME, CUSTO) VALUES(?,?,?,?)";
        try {   
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(2,descricao);
            pstmt.setString(3,nome);
            pstmt.setDouble(4,custo);
            pstmt.setInt(1,codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar Materia Prima\n"+ex);
        }
       
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM MATERIA_PRIMA WHERE COD=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setInt(1,codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao deletar Materia Prima\n"+ex);
        }
        
    }
   
    
    public void alterar(){
        PreparedStatement pstmt = null;
        String sql=" UPDATE MATERIA_PRIMA SET DESCRICAO=?, NOME=?, CUSTO=? WHERE COD=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,descricao);
            pstmt.setString(2,nome);
            pstmt.setInt(4, codigo);
            pstmt.setDouble(3,custo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar Materia Prima\n"+ex);
        }
        
    }
    
    public ArrayList<MMateriaPrima> listar(){
        
        ArrayList<MMateriaPrima> materias = new ArrayList<>();
        String sql="SELECT * FROM MATERIA_PRIMA";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                
                int codigo1 = rs.getInt("cod");
                String descricao1 = rs.getString("descricao");
                String nome1 = rs.getString("nome");
                Double custo1 = rs.getDouble("custo");
                
                MMateriaPrima u1 = new MMateriaPrima(codigo1, descricao1, nome1, custo1);
                materias.add(u1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar MateriaPrima\n" + ex);
        }
        
        return materias;
        
    }
}
