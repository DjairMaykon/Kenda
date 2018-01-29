/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author JFelipe
 */
public class Faz {
    private int codigoProducao;
    private int codigoTinta;
    private int qtd;

    public int getCodigoProducao() {
        return codigoProducao;
    }

    public void setCodigoProducao(int codigoProducao) {
        this.codigoProducao = codigoProducao;
    }

    public int getCodigoTinta() {
        return codigoTinta;
    }

    public void setCodigoTinta(int codigoTinta) {
        this.codigoTinta = codigoTinta;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    
}
