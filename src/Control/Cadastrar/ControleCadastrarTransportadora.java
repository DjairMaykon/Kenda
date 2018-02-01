/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Cadastrar;
import Control.Utils.UtilEndereco;
import Model.MEndereco;
import Model.MTransportadoras;
import View.TelasCadastrar.TCadastrarTransportadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarTransportadora {
    
   private TCadastrarTransportadora telaCadastrarTransportadora; 
   private MTransportadoras modeloMTransportadoras; 
    
    public ControleCadastrarTransportadora () {  
        
        
        telaCadastrarTransportadora = new TCadastrarTransportadora();
    
        modeloMTransportadoras = new MTransportadoras();
        
         ArrayList<MTransportadoras> listar = modeloMTransportadoras.listar();
       
        
        if(listar.isEmpty()){
            
            modeloMTransportadoras.setCodigo(0);
            
        }else{
            
            int c = listar.get(listar.size()-1).getCodigo()+ 1;
            modeloMTransportadoras.setCodigo(c);
            
        }
        
        telaCadastrarTransportadora.getjTFCodigoTransportadora().setText(String.valueOf(modeloMTransportadoras.getCodigo()));
      
        telaCadastrarTransportadora.getjBCadastrarTransportadora().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                if(validarEntradas()){       
                    
                    cadastrarTransportadora();
                  
                }
              
            }
        });
        
        telaCadastrarTransportadora.getjBuscarEndereco().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                MEndereco end = UtilEndereco.buscarEndereco(telaCadastrarTransportadora.getjTFCodigoEndereco().getText());
                
                JOptionPane.showMessageDialog(null, "CEP: "+end.getCep()+"\n"+
                                              "UF: "+end.getUf() + "\n"+
                                              "Cidade: "+end.getCidade() + "\n"+
                                              "Bairro: "+end.getBairro()+"\n"+
                                              "Rua: "+end.getRua());
                
                modeloMTransportadoras.setCodEnd(end.getCodigo());
                
            }
        });
        
      
    }
    
    public TCadastrarTransportadora getTelaCadastrarTransportadora() {
        return telaCadastrarTransportadora;
    }

    public boolean validarEntradas(){
        
        return true;
        
    }
    
    public void cadastrarTransportadora(){
        
        modeloMTransportadoras.setCnpj(telaCadastrarTransportadora.getjTFCPNJ().getText());
        modeloMTransportadoras.setNome(telaCadastrarTransportadora.getjTFNome().getText());
        modeloMTransportadoras.setFrete (Integer.parseInt( telaCadastrarTransportadora.getjTFFrete().getText()));
        modeloMTransportadoras.setTelefone(telaCadastrarTransportadora.getjTFTelefone().getText());
         modeloMTransportadoras.setUnidadeDoFrete(telaCadastrarTransportadora.getjTFUnidadeFrete().getText());
      
        modeloMTransportadoras.adicionar(); 
        
        telaCadastrarTransportadora.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        telaCadastrarTransportadora.dispose();
        
    }

}
    
