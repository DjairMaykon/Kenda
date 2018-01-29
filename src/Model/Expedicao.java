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
public class Expedicao {
    private Date dataEntra;
    private Date dataSai; 
    private String situacao;
    private int codExped;
    private int codPed;
    private int codTransp;
    private String descricao;
    private double custo;

    public Date getDataEntra() {
        return dataEntra;
    }

    public void setDataEntra(Date dataEntra) {
        this.dataEntra = dataEntra;
    }

    public Date getDataSai() {
        return dataSai;
    }

    public void setDataSai(Date dataSai) {
        this.dataSai = dataSai;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getCodExped() {
        return codExped;
    }

    public void setCodExped(int codExped) {
        this.codExped = codExped;
    }

    public int getCodPed() {
        return codPed;
    }

    public void setCodPed(int codPed) {
        this.codPed = codPed;
    }

    public int getCodTransp() {
        return codTransp;
    }

    public void setCodTransp(int codTransp) {
        this.codTransp = codTransp;
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

   
}
