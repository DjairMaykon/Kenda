/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.MEndereco;
import Model.MFornecedores;
import Model.MFuncionario;
import View.TelasCadastrar.Funcionario.TCadastrarFuncionario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarFuncionario {
    
   private TCadastrarFuncionario telaCadastrarFuncionario;
   
   private MFuncionario modeloFuncionario;
   
    
    public ControleCadastrarFuncionario () { 
        telaCadastrarFuncionario = new TCadastrarFuncionario();
        modeloFuncionario = new MFuncionario();
      
        ArrayList<MFuncionario> listar = modeloFuncionario.listar();
        
        if(listar.isEmpty()){
            
            modeloFuncionario.setCodigo(0);
            
        }else{
            
            int c = listar.get(listar.size()-1).getCodigo() + 1;
            modeloFuncionario.setCodigo(c);
            
        }
        
        telaCadastrarFuncionario.getjTFCodigoCliente().setText(String.valueOf(modeloFuncionario.getCodigo()));
      
        telaCadastrarFuncionario.getjBCancelarCliente().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                if(validarEntradas()){
                  
                    cadastrarFornecedor();
                  
                }
              
            }
        });
        
        telaCadastrarFuncionario.getjBuscarEndereco().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                MEndereco end = MEndereco.buscarEndereco(telaCadastrarFuncionario.getjTFCodigoCliente().getText());
                
                JOptionPane.showMessageDialog(null, "CEP: "+end.getCep()+"\n"+
                                              "UF: "+end.getUf() + "\n"+
                                              "Cidade: "+end.getCidade() + "\n"+
                                              "Bairro: "+end.getBairro()+"\n"+
                                              "Rua: "+end.getRua());
                
                modeloFuncionario.setCodigoEnd(end.getCodigo());
                
            }
        });
        
      
    }
    
    public TCadastrarFuncionario getTelaCadastrarFuncionario(){
        return telaCadastrarFuncionario;
    }

    public boolean validarEntradas(){
        
        return true;
        
    }
    
    public void cadastrarFornecedor(){
        
        modeloFuncionario.setCpf(telaCadastrarFuncionario.getjTFCPNJ().getText());
        modeloFuncionario.setEmail(telaCadastrarFuncionario.getjTFEmail().getText());
        modeloFuncionario.setNome(telaCadastrarFuncionario.getjTFNome().getText());
        modeloFuncionario.setTelefone(telaCadastrarFuncionario.getjTFTelefone().getText());
        modeloFuncionario.setCodigoEnd(telaCadastrarFuncionario.getjTFEndereco().getText());
        modeloFuncionario.adicionar();
        
        telaCadastrarFuncionario.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        telaCadastrarFuncionario.dispose();
        
    }
    
}
