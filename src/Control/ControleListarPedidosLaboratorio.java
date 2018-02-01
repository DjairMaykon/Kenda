/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.Listar.Pedidos.TListarPedidosLaboratorio;

/**
 *
 * @author Djair Maykon
 */
class ControleListarPedidosLaboratorio {
    
    private TListarPedidosLaboratorio telaListarPedidosLaboratorio;

    public ControleListarPedidosLaboratorio() {
    
        telaListarPedidosLaboratorio = new TListarPedidosLaboratorio();
    
    }

    public TListarPedidosLaboratorio gettelaListarPedidosLaboratorio() {
        return telaListarPedidosLaboratorio;
    }
    
}
