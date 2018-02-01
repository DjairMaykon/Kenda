/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Cadastrar;
import Control.Utils.ControleToolTip;
import Model.MSetor;
import View.TelasCadastrar.TCadastrarSetor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarSetor {
    
    private TCadastrarSetor telaCadastrarSetor;
    private MSetor modeloSetor;
    
    private ControleToolTip toolTip;
    private String invalido = "";
    
    public ControleCadastrarSetor() {
    
        telaCadastrarSetor = new TCadastrarSetor();
        modeloSetor = new MSetor();
        
        toolTip = new ControleToolTip();
        
        telaCadastrarSetor.getjTFNome().requestFocus();
        
        ArrayList<MSetor> listar = modeloSetor.listar();
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
        telaCadastrarSetor.getjTDescricao().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("descricao")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarSetor.getjTFNome().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("nome")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });        
    
    }

    public TCadastrarSetor getTelaCadastrarSetor() {
        return telaCadastrarSetor;
    }

   
    public boolean validarEntradas(){
        
        if(telaCadastrarSetor.getjTFNome().getText().isEmpty()){
            
            invalido = "nome";
            telaCadastrarSetor.getjTFNome().requestFocus();
            toolTip.showToolTip(telaCadastrarSetor.getjTFNome(), "Insira um Nome");
            
        }else if(telaCadastrarSetor.getjTDescricao().getText().isEmpty()){
            
            invalido = "descricao";
            telaCadastrarSetor.getjTDescricao().requestFocus();
            toolTip.showToolTip(telaCadastrarSetor.getjTDescricao(), "Insira uma Descrição");
            
        }else{
            
            invalido = "";
            return true;
            
        }
        
        return false;
        
    }
    
    public void cadastrarFornecedor(){
        
        modeloSetor.setDescricao(telaCadastrarSetor.getjTDescricao().getText());
        modeloSetor.setNome(telaCadastrarSetor.getjTFNome().getText());
        modeloSetor.adicionar();
        
        telaCadastrarSetor.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        toolTip.hideToolTip();
        telaCadastrarSetor.dispose();
        
    }
    
}
