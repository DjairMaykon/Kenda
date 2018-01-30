/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import br.com.parg.viacep.ViaCEP;
import br.com.parg.viacep.ViaCEPException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kaione
 */
public class MEndereco {
    private String cep; 
    private String uf;
    private String cidade;
    private String bairro;
    private int codigo;
    private String rua;
    private Connection con = null;

    public MEndereco(String cep, String uf, String cidade, String bairro, int codigo, String rua) {
        this.cep = cep;
        this.uf = uf;
        this.cidade = cidade;
        this.bairro = bairro;
        this.codigo = codigo;
        this.rua = rua;
    }
    

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

  
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
    public void adicionar(){
        
        PreparedStatement pstmt = null;
        String sql="INSERT INTO ENDERECO(UF, CIDADE, RUA, COD, BAIRRO, CEP) VALUES(?,?,?,?,?,?)";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,uf);
            pstmt.setString(2,cidade);
            pstmt.setString(3,rua);
            pstmt.setString(5,bairro);
            pstmt.setString(6,cep);
            pstmt.setInt(4,codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao adicionar:\n"+ex);
        }
        
    }
    
    public void deletar(){
        PreparedStatement pstmt = null;
        String sql="DELETE FROM ENDERECO WHERE COD=? ";
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
        String sql=" UPDATE ENDERECO SET UF=?, CIDADE=?, RUA=?, BAIRRO=?,CEP=? WHERE COD=? ";
        try {
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            pstmt.setString(1,uf);
            pstmt.setString(2,cidade);
            pstmt.setString(3,rua);
            pstmt.setString(4,bairro);
            pstmt.setString(5,cep);
            pstmt.setInt(6, codigo);
            pstmt.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar");
        }
        
    }
    
    public ArrayList<MEndereco> listar(){
        
        ArrayList<MEndereco> enderecos = null;
        String sql="SELECT * FROM ENDERECO";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
        try {
        
            con = new MConnectionFactory().getConnection();
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            
            enderecos = new ArrayList<>();
            
            while(rs.next()){
                
                String cep1 = rs.getString("cep");
                String uf1 = rs.getString("uf");
                String cidade1 = rs.getString("cidade");
                String bairro1 = rs.getString("bairro");
                int codigo1 = rs.getInt("cod");
                String rua1 = rs.getString("rua");
                
                MEndereco u1 = new MEndereco(cep1, uf1, cidade1, bairro1, codigo1, rua1);
                enderecos.add(u1);
            }
            
        } catch (SQLException ex) {
            System.out.println("Erro ao alterar Usuario\n" + ex);
        }
        
        return enderecos;
        
    }

    public MEndereco() {
    
    }
   
    public static MEndereco buscarEndereco(String _cep){
        
        MEndereco end = null;
        
        try {
            
            end = new MEndereco();
            
            ArrayList<MEndereco> listar = end.listar();
        
            if(listar.isEmpty()){
            
                end.setCodigo(0);
            
            }else{
                
                for(MEndereco e : listar){
                    
                    if(e.cep.equals(_cep)){
                        
                        return e;
                        
                    }
                    
                }
                
                int c = listar.get(0).getCodigo() + 1;
                end.setCodigo(c);
                
            }
            
            ViaCEP vCep = new ViaCEP(_cep);
            end.setBairro(vCep.getBairro());
            end.setCep(_cep);
            end.setCidade(vCep.getLocalidade());
            end.setRua(vCep.getLogradouro());
            end.setUf(vCep.getUf());
            
            end.adicionar();
            
        } catch (ViaCEPException ex) {
            Logger.getLogger(MEndereco.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return end;
        
    }
    
}
