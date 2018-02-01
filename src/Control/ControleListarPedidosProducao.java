/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.Listar.Pedidos.TListarPedidosProducao;

/**
 *
 * @author Djair Maykon
 */
class ControleListarPedidosProducao {
    
    private TListarPedidosProducao telaListarPedidosProducao;

    public ControleListarPedidosProducao() {
    
        telaListarPedidosProducao = new TListarPedidosProducao();
    
    }

    public TListarPedidosProducao gettelaListarPedidosProducao() {
        return telaListarPedidosProducao;
    }
    
}
