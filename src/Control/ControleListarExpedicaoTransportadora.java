/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.Listar.Expedicao.TListarExpedicaoEmAndamento;
import View.Listar.Expedicao.TListarExpedicaoTransportadora;







/**
 *
 * @author Djair Maykon
 */
class ControleListarExpedicaoTransportadora {
    
    private TListarExpedicaoTransportadora telaListarExpedicaoTransportadora;

    public ControleListarExpedicaoTransportadora() {
    
        telaListarExpedicaoTransportadora = new TListarExpedicaoTransportadora();
    
    }

    public TListarExpedicaoTransportadora gettelaListarExpedicaoTransportadora() {
        return telaListarExpedicaoTransportadora;
    }
    
}
