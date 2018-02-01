/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Novo;

import Control.ControlePrincipal;
import View.TelasNovo.TNovoAvaliacaoTinta;
import java.awt.event.ContainerAdapter;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author Djair Maykon
 */
public class ControleNovoAvaliacaoTinta {
    
    private TNovoAvaliacaoTinta telaNovoAvaliacaoTinta;

    public ControleNovoAvaliacaoTinta() {
    
        telaNovoAvaliacaoTinta = new TNovoAvaliacaoTinta();
        
    }

    public TNovoAvaliacaoTinta getTelaNovoAvaliacaoTinta() {
        return telaNovoAvaliacaoTinta;
    }
    
}
