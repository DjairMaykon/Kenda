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



public class MAlocado {
    private int codigoSetor;
    private String funcao;
    private int codigoFuncionario;
    private Connection con;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public int getCodigoFuncionario() {
        return codigoFuncionario;
    }

    public MAlocado(int codigoSetor, String funcao, int codigoFuncionario) {
        this.codigoSetor = codigoSetor;
        this.funcao = funcao;
        this.codigoFuncionario = codigoFuncionario;
    }

    public void setCodigoFuncionario(int codigoFuncionario) {
        this.codigoFuncionario = codigoFuncionario;
    }
    
    public void adicionar(){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "INSERT INTO alocado (cod_setor, cod_funcionario, funcao) VALUES(?,?,?)";
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setInt(1, codigoSetor); //strings /\
            pstmt.setInt(2,codigoFuncionario);
            pstmt.setString(3,funcao);
            pstmt.executeUpdate();
            
           
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO ADICIONAR\n" + ex);
            
        }   
        
    }
    
    public void deletar(String por){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "DELETE FROM alocado WHERE ? = ?";
     
        int cod = 0;
        
        if(por.equals("funcionario")){
            por = "cod_funcionario";
            cod = codigoFuncionario;
        }else if(por.equals("setor")){
            por = "cod_setor";
            cod = codigoSetor;
        }else{
            System.err.println("Parametro incorreto: (funcionario) ou (setor)");
            return;
        }
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
            pstmt.setString(1, por);
            pstmt.setInt(2, cod);
            
            pstmt.executeUpdate();
       
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO AO DELETAR\n" + ex);
            
        }   
        
    }
    
     public void alterar(String por){
    
        PreparedStatement pstmt = null;
        
        String sql1 = "UPDATE alocado SET funcao=? WHERE ? = ?";
        
        int cod = 0;
        
        if(por.equals("funcionario")){
            por = "cod_funcionario";
            cod = codigoFuncionario;
        }else if(por.equals("setor")){
            por = "cod_setor";
            cod = codigoSetor;
        }else{
            System.err.println("Parametro incorreto: (funcionario) ou (setor)");
            return;
        }
        
        
        try {
            
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql1);
        
           //strings /\
            pstmt.setString(1,funcao);
            pstmt.setString(2, por);
            pstmt.setInt(3, cod);
           
            
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("ERRO ao alterar\n" + ex);
            
        }   
        
    }
     
     public ArrayList<MAlocado> listar(){
        
        ArrayList<MAlocado> alocados = new ArrayList<>();
        String sql="SELECT * FROM ALOCADO";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            while(rs.next()){
                
                int codigoSetor1 = rs.getInt("cod_setor");
                String funcao1 = rs.getString("funcao");
                int codigoFuncionario1 = rs.getInt("cod_funcionario");
                
                MAlocado a1 = new MAlocado(codigoSetor1, funcao1, codigoFuncionario1);
                alocados.add(a1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao listar Alocado\n" + ex);
        }
        
        return alocados;
        
    }

    
}
