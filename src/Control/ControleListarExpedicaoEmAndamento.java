/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.Listar.Expedicao.TListarExpedicaoEmAndamento;

/**
 *
 * @author Djair Maykon
 */
class ControleListarExpedicaoEmAndamento {
    
    private TListarExpedicaoEmAndamento telaListarExpedicaoEmAndamento;

    public ControleListarExpedicaoEmAndamento() {
    
        telaListarExpedicaoEmAndamento = new TListarExpedicaoEmAndamento();
    
    }

    public TListarExpedicaoEmAndamento gettelaListarExpedicaoEmAndamento() {
        return telaListarExpedicaoEmAndamento;
    }
    
}
