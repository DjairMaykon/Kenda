/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Djair Maykon
 */
public class Funcionario {
    
    private int codigo;
    private int codigoEnd;
    private String email;
    private double salario;
    private String login;
    private String nome;
    private String cpf;
    private String telefone;
    private InputStream foto;
    private Connection con = null;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoEnd() {
        return codigoEnd;
    }

    public void setCodigoEnd(int codigoEnd) {
        this.codigoEnd = codigoEnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public InputStream getFoto() {
        return foto;
    }

    public void setFoto(InputStream foto) {
        this.foto = foto;
    }
    
    public void adicionar(){
        
        String sql = "INSERT INTO funcionario(cod, cod_end, email, salario, login, nome, cpf, telefone, foto) VALUES(?,?,?,?,?,?,?,?,?)";
        
        PreparedStatement pstmt = null;
        
        try {
            
            pstmt = con.prepareStatement(sql);
            
            pstmt.setInt(1, codigo);
            pstmt.setInt(2, codigoEnd);
            pstmt.setString(3, email);
            pstmt.setDouble(4, salario);
            pstmt.setString(5, login);
            pstmt.setString(6, nome);
            pstmt.setString(7, cpf);
            pstmt.setString(8, telefone);
            pstmt.setBlob(9, foto);
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir\n"+ex);
        }
        
    }
    
    public void remover(){
        
        String sql = "DELERE FROM funcionario WHERE cod=?";
        
        PreparedStatement pstmt = null;
        
        try {
            
            pstmt = con.prepareStatement(sql);
            
            pstmt.setInt(1, codigo);
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar\n"+ex);
        }
        
    }

    public void alterar(){
        
        String sql = "UPDATE funcionario SET cod_end=?, email=?, salario=?, login=?, nome=?, cpf=?, telefone=?, foto=? WHERE cod=?";
        
        PreparedStatement pstmt = null;
        
        try {
            
            pstmt = con.prepareStatement(sql);
            
            pstmt.setInt(1, codigoEnd);
            pstmt.setString(2, email);
            pstmt.setDouble(3, salario);
            pstmt.setString(4, login);
            pstmt.setString(5, nome);
            pstmt.setString(6, cpf);
            pstmt.setString(7, telefone);
            pstmt.setBlob(8, foto);
            pstmt.setInt(9, codigo);
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao inserir\n"+ex);
        }
        
    }
    
}
