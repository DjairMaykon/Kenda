/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.Listar.Expedicao.TListarExpedicaoFinalizados;

/**
 *
 * @author Djair Maykon
 */
class ControleListarExpedicaoFinalizados {
    
    private TListarExpedicaoFinalizados telaListarExpedicaoFinalizados;

    public ControleListarExpedicaoFinalizados() {
    
        telaListarExpedicaoFinalizados = new TListarExpedicaoFinalizados();
    
    }

    public TListarExpedicaoFinalizados gettelaListarExpedicaoFinalizados() {
        return telaListarExpedicaoFinalizados;
    }
    
}
