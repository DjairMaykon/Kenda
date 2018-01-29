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
public class Fornece {
    private int codigoFornecedores;
    private int codigoMateriaPrima;
    private double custo;

    public int getCodigoFornecedores() {
        return codigoFornecedores;
    }

    public void setCodigoFornecedores(int codigoFornecedores) {
        this.codigoFornecedores = codigoFornecedores;
    }

    public int getCodigoMateriaPrima() {
        return codigoMateriaPrima;
    }

    public void setCodigoMateriaPrima(int codigoMateriaPrima) {
        this.codigoMateriaPrima = codigoMateriaPrima;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    
}
