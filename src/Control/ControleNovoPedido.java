/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.TelasNovo.TNovoPedido;

/**
 *
 * @author Djair Maykon
 */
class ControleNovoPedido {
    
    private TNovoPedido telaNovoPedido;

    public ControleNovoPedido() {
    
        telaNovoPedido = new TNovoPedido();
    
    }

    public TNovoPedido getTelaNovoPedido() {
        return telaNovoPedido;
    }
    
}
