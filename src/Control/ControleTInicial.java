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
        
        telaInicial.getjMICadastrarCliente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarCliente(e);
            }
        });
        
        telaInicial.getjMICadastrarTinta().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarTinta(e);
            }
        });
        
        telaInicial.getjMICadastrarTransportadora().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarTransportadora(e);
            }
        });
        
        telaInicial.getjMICadastrarFornecedores().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarFornecedor(e);
            }
        });
           
            
        telaInicial.getjMICadastrarFuncionario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarFuncionario(e);
            }
        });
             
        telaInicial.getjMICadastrarSetor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoMICadastrarSetor(e);
            }
        });
         
    }
    
    public void acaoMINovoPedido(ActionEvent evt){
        
        ControleNovoPedido cNovoPedido = new ControleNovoPedido();
        telaInicial.getjDPPrincipal().add(cNovoPedido.getTelaNovoPedido());
        cNovoPedido.getTelaNovoPedido().setVisible(true);
        
    }
    
    public void acaoMICadastrarCliente(ActionEvent evt){
        
        ControleCadastrarCliente cCadastrarCliente = new ControleCadastrarCliente();
        telaInicial.getjDPPrincipal().add(cCadastrarCliente.getCadastrarCliente());
        cCadastrarCliente.getCadastrarCliente().setVisible(true);
        
    }
    
    
    public void acaoMICadastrarSetor(ActionEvent evt){
        
        ControleCadastrarSetor cCadastrarSetor = new ControleCadastrarSetor();
        telaInicial.getjDPPrincipal().add(cCadastrarSetor.getCadastrarSetor());
        cCadastrarSetor.getCadastrarSetor().setVisible(true);
        
    }
     
    public void acaoMICadastrarTinta(ActionEvent evt){
        
        ControleCadastrarTinta cCadastrarTinta = new ControleCadastrarTinta();
        telaInicial.getjDPPrincipal().add(cCadastrarTinta.getCadastrarTinta());
        cCadastrarTinta.getCadastrarTinta().setVisible(true);
        
    }
      
    public void acaoMICadastrarFornecedor(ActionEvent evt){
        
        ControleCadastrarFornecedor cCadastrarFornecedor = new ControleCadastrarFornecedor();
        telaInicial.getjDPPrincipal().add(cCadastrarFornecedor.getCadastrarFornecedor());
        cCadastrarFornecedor.getCadastrarFornecedor().setVisible(true);
        
    }
    
    public void acaoMICadastrarTransportadora(ActionEvent evt){
        
        ControleCadastrarTransportadora cCadastrarTransportadora = new ControleCadastrarTransportadora();
        telaInicial.getjDPPrincipal().add(cCadastrarTransportadora.getCadastrarTransportadora());
        cCadastrarTransportadora.getCadastrarTransportadora().setVisible(true);
        
    }
          
    public void acaoMICadastrarFuncionario(ActionEvent evt){
        
        ControleCadastrarFuncionario cCadastrarFuncionario = new ControleCadastrarFuncionario();
        telaInicial.getjDPPrincipal().add(cCadastrarFuncionario.getCadastrarFuncionario());
        cCadastrarFuncionario.getCadastrarFuncionario().setVisible(true);
        
    }
    
    
}
