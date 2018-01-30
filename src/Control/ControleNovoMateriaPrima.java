/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.TelasNovo.TNovoMateriaPrima;

/**
 *
 * @author Djair Maykon
 */
class ControleNovoMateriaPrima {
    
    private TNovoMateriaPrima telaNovoMateriaPrima;

    public ControleNovoMateriaPrima() {
    
        telaNovoMateriaPrima = new TNovoMateriaPrima();
    
    }

    public TNovoMateriaPrima getTelaNovoPedido() {
        return telaNovoMateriaPrima;
    }
    
}
