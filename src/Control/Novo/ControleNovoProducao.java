/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Novo;

import View.TelasNovo.TNovoProducao;

/**
 *
 * @author Djair Maykon
 */
public class ControleNovoProducao {
    
    private TNovoProducao telaNovoProducao;

    public ControleNovoProducao() {
    
        telaNovoProducao = new TNovoProducao();
    
    }

    public TNovoProducao getTelaNovoProducao() {
        return telaNovoProducao;
    }
    
}
