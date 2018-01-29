/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Kaione
 */
public class Transportadoras {

    private String nome;
    private int codEnd;
    private String cnpj;
    private int codTransp;
    private String unidadeDoFrete;
    private String telefone;
    private double frete;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodEnd() {
        return codEnd;
    }

    public void setCodEnd(int codEnd) {
        this.codEnd = codEnd;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public int getCodTransp() {
        return codTransp;
    }

    public void setCodTransp(int codTransp) {
        this.codTransp = codTransp;
    }

    public String getUnidadeDoFrete() {
        return unidadeDoFrete;
    }

    public void setUnidadeDoFrete(String unidadeDoFrete) {
        this.unidadeDoFrete = unidadeDoFrete;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public double getFrete() {
        return frete;
    }

    public void setFrete(double frete) {
        this.frete = frete;
    }

    
        

    
}
