/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.MUsuario;
import View.TInicial;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Djair Maykon
 */
class ControleTInicial {
    
    private TInicial telaInicial;
    private MUsuario modeloUsuario;

    public ControleTInicial(MUsuario u1) {
    
        modeloUsuario = u1;
        telaInicial = new TInicial();
        telaInicial.setVisible(true);
        
        telaInicial.getjMINovoPedido().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMINovoPedido(e);
            }
        });

    }
    
    public void acaoMINovoPedido(ActionEvent evt){
        
        ControleNovoPedido cNovoPedido = new ControleNovoPedido();
        telaInicial.getjDPPrincipal().add(cNovoPedido.getTelaNovoPedido());
        cNovoPedido.getTelaNovoPedido().setVisible(true);
        
    }
    
}
