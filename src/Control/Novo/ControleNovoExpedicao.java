/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Novo;

import View.TelasNovo.TNovoExpedicao;

/**
 *
 * @author Djair Maykon
 */
public class ControleNovoExpedicao {
    
    private TNovoExpedicao telaNovoExpedicao;

    public ControleNovoExpedicao() {
    
        telaNovoExpedicao = new TNovoExpedicao();
    
    }

    public TNovoExpedicao getTelaNovoExpedicao() {
        return telaNovoExpedicao;
    }
    
}
