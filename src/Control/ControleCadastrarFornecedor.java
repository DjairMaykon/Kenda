/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.MEndereco;
import Model.MFornecedores;
import View.TelasCadastrar.TCadastrarFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarFornecedor {
    
    private TCadastrarFornecedor telaCadastrarFornecedor; 
    private MFornecedores modeloFornecedores;
    
    public ControleCadastrarFornecedor() {
    
        telaCadastrarFornecedor = new TCadastrarFornecedor();
        modeloFornecedores = new MFornecedores();
      
        ArrayList<MFornecedores> listar = modeloFornecedores.listar();
        
        if(listar.isEmpty()){
            
            modeloFornecedores.setCodigo(0);
            
        }else{
            
            int c = listar.get(listar.size()-1).getCodigo() + 1;
            modeloFornecedores.setCodigo(c);
            
        }
        
        telaCadastrarFornecedor.getjTFCodigoFornecedor().setText(String.valueOf(modeloFornecedores.getCodigo()));
      
        telaCadastrarFornecedor.getjBCadastrarFornecedor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                if(validarEntradas()){
                  
                    cadastrarFornecedor();
                  
                }
              
            }
        });
        
        telaCadastrarFornecedor.getjBuscarEndereco().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                MEndereco end = MEndereco.buscarEndereco(telaCadastrarFornecedor.getjTFCodigoEndereco().getText());
                
                JOptionPane.showMessageDialog(null, "CEP: "+end.getCep()+"\n"+
                                              "UF: "+end.getUf() + "\n"+
                                              "Cidade: "+end.getCidade() + "\n"+
                                              "Bairro: "+end.getBairro()+"\n"+
                                              "Rua: "+end.getRua());
                
                modeloFornecedores.setCodigoEndereco(end.getCodigo());
                
            }
        });
        
        telaCadastrarFornecedor.getjBCancelarFornecedor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                cancelarCadastro();
              
            }
        });
        
      
    }
    
    public TCadastrarFornecedor getTelaCadastrarFornecedor() {
        return telaCadastrarFornecedor;
    }

    public boolean validarEntradas(){
        
        return true;
        
    }
    
    public void cadastrarFornecedor(){
        
        modeloFornecedores.setCnpj(telaCadastrarFornecedor.getjTFCPNJ().getText());
        modeloFornecedores.setEmail(telaCadastrarFornecedor.getjTFEmail().getText());
        modeloFornecedores.setNome(telaCadastrarFornecedor.getjTFNome().getText());
        modeloFornecedores.setSite(telaCadastrarFornecedor.getjTFSite().getText());
        modeloFornecedores.setTelefone(telaCadastrarFornecedor.getjTFTelefone().getText());
        modeloFornecedores.adicionar();
        
        telaCadastrarFornecedor.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        telaCadastrarFornecedor.dispose();
        
    }
    
}
