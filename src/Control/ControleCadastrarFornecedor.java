/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.MFornecedores;
import View.TelasCadastrar.TCadastrarFornecedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
        
        if(listar == null){
            
            modeloFornecedores.setCodigo(0);
            
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
      
    }

    public TCadastrarFornecedor getTelaCadastrarFornecedor() {
        return telaCadastrarFornecedor;
    }

    public boolean validarEntradas(){
        
        return true;
        
    }
    
    public void cadastrarFornecedor(){
        
        
        
    }
    
}
