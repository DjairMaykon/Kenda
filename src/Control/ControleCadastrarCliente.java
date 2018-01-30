/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.MCliente;
import Model.MEndereco;
import View.TelasCadastrar.TCadastrarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarCliente {
    
    private TCadastrarCliente telaCadastrarCliente;
    private MCliente modeloCliente;
    
     public ControleCadastrarCliente() {
         
        telaCadastrarCliente = new TCadastrarCliente();
        modeloCliente = new MCliente();
        
         ArrayList<MCliente> listar = modeloCliente.listar();
       
        
        if(listar.isEmpty()){
            
            modeloCliente.setCodigo_cliente(0);
            
        }else{
            
            int c = listar.get(listar.size()-1).getCodigo()+ 1;
            modeloCliente.setCodigo_cliente(c);
            
        }
        
        telaCadastrarCliente.getjTFCodigoCliente().setText(String.valueOf(modeloCliente.getCodigo()));
      
        telaCadastrarCliente.getjBCadastrarCliente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                if(validarEntradas()){       
                    
                    cadastrarCliente();
                  
                }
              
            }
        });
        
        telaCadastrarCliente.getjBuscarEndereco().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                MEndereco end = MEndereco.buscarEndereco(telaCadastrarCliente.getjTFEndereco().getText());
                
                JOptionPane.showMessageDialog(null, "CEP: "+end.getCep()+"\n"+
                                              "UF: "+end.getUf() + "\n"+
                                              "Cidade: "+end.getCidade() + "\n"+
                                              "Bairro: "+end.getBairro()+"\n"+
                                              "Rua: "+end.getRua());
                
                modeloCliente.setCodigoEndereco(end.getCodigo());
                
            }
        });
        
      
    }
    
    public TCadastrarCliente getTelaCadastrarCliente() {
        return telaCadastrarCliente;
    }

    public boolean validarEntradas(){
        
        return true;
        
    }
    
    public void cadastrarCliente(){
        
        modeloCliente.setCnpj(telaCadastrarCliente.getjTFCPNJ().getText());
        modeloCliente.setEmail(telaCadastrarCliente.getjTFEmail().getText());
        modeloCliente.setNome(telaCadastrarCliente.getjTFNome().getText());
        modeloCliente.setTelefone(telaCadastrarCliente.getjTFTelefone().getText());
      
        modeloCliente.adicionar();
        
        telaCadastrarCliente.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        telaCadastrarCliente.dispose();
        
    }
    
}
