/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import Model.MSetor;
import View.TelasCadastrar.TCadastrarSetor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarSetor {
    
    private TCadastrarSetor telaCadastrarSetor;
    private MSetor modeloSetor;
    
     public ControleCadastrarSetor() {
    
        telaCadastrarSetor = new TCadastrarSetor();
       
        modeloSetor = new MSetor();
      
        ArrayList<MSetor> listar = modeloSetor.listar();
        
        for(MSetor m : listar){
            System.out.println(m.getCodigo()+"\n"+m.getDescricao()+"\n"+m.getNome());
        }
        
        if(listar.isEmpty()){
            
            modeloSetor.setCodigo(0);
            
        }else{
            
            int c = listar.get(listar.size()-1).getCodigo() + 1;
            modeloSetor.setCodigo(c);
            
        }
        
        telaCadastrarSetor.getjTFCodigoSetor().setText(String.valueOf(modeloSetor.getCodigo()));
      
        telaCadastrarSetor.getjBCadastrarSetor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                if(validarEntradas()){
                  
                    cadastrarFornecedor();
                  
                }
              
            }
        });
        
        telaCadastrarSetor.getjBCancelarSetor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                cancelarCadastro();
              
            }
        });
    
    }

    public TCadastrarSetor getTelaCadastrarSetor() {
        return telaCadastrarSetor;
    }

   
    public boolean validarEntradas(){
        
        return true;
        
    }
    
    public void cadastrarFornecedor(){
        
        modeloSetor.setDescricao(telaCadastrarSetor.getjTDescricao().getText());
        modeloSetor.setNome(telaCadastrarSetor.getjTFNome().getText());
        modeloSetor.adicionar();
        
        telaCadastrarSetor.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        telaCadastrarSetor.dispose();
        
    }
    
}
