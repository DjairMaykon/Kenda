/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Cadastrar;
import Control.Utils.ControleToolTip;
import Control.Utils.UtilEndereco;
import Model.MCliente;
import Model.MEndereco;
import View.TelasCadastrar.TCadastrarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarCliente {
    
    private TCadastrarCliente telaCadastrarCliente;
    private MCliente modeloCliente;
    
    private ControleToolTip toolTip;
    private String invalido = "";
    
     public ControleCadastrarCliente() {
         
        telaCadastrarCliente = new TCadastrarCliente();
        modeloCliente = new MCliente();
        
        toolTip = new ControleToolTip();
        
        telaCadastrarCliente.getjTFNome().requestFocus();
        
        ArrayList<MCliente> listar = modeloCliente.listar();
        if(listar.isEmpty()){
            
            modeloCliente.setCodigo(0);
            
        }else{
            
            int c = listar.get(listar.size()-1).getCodigo()+ 1;
            modeloCliente.setCodigo(c);
            
        }
        
        modeloCliente.setCodigoEndereco(-1);
        telaCadastrarCliente.getjTFCodigoCliente().setText(String.valueOf(modeloCliente.getCodigo()));
      
        telaCadastrarCliente.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                toolTip.hideToolTip();
            }
        });
        
        telaCadastrarCliente.getjBCadastrarCliente().addActionListener((ActionEvent e) -> {
            if(validarEntradas())
                cadastrarCliente();
        });
        telaCadastrarCliente.getjBCancelarCliente().addActionListener((ActionEvent e) -> {
            cancelarCadastro();
        });
        
        telaCadastrarCliente.getjBuscarEndereco().addActionListener((ActionEvent e) -> {
            
            if(telaCadastrarCliente.getjTFCEP().getText().isEmpty()){
                
                toolTip.showToolTip(telaCadastrarCliente.getjTFCEP(), "Digite um CEP Válido");
                
            }
            
            MEndereco end = UtilEndereco.buscarEndereco(telaCadastrarCliente.getjTFEndereco().getText());
            
            JOptionPane.showMessageDialog(null, "CEP: "+end.getCep()+"\n"+
                                                "UF: "+end.getUf() + "\n"+
                                                "Cidade: "+end.getCidade() + "\n"+
                                                "Bairro: "+end.getBairro()+"\n"+
                                                "Rua: "+end.getRua());
            
            modeloCliente.setCodigoEndereco(end.getCodigo());
        });
        
        telaCadastrarCliente.getjTFNome().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("nome")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarCliente.getjTFCPNJ().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("cnpj")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarCliente.getjTFTelefone().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("telefone")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarCliente.getjTFEndereco().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("endereco")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        
        telaCadastrarCliente.getjBuscarEndereco().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                if(invalido.equals("endereco")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
      
    }
    
    public TCadastrarCliente getTelaCadastrarCliente() {
        return telaCadastrarCliente;
    }

    public boolean validarEntradas(){
        
        if(telaCadastrarCliente.getjTFNome().getText().isEmpty()){
            
            invalido = "nome";
            telaCadastrarCliente.getjTFNome().requestFocus();
            toolTip.showToolTip(telaCadastrarCliente.getjTFNome(), "Insira um Nome");
            
        }else if(telaCadastrarCliente.getjTFCPNJ().getText().equals("  .   .   /    -  ")){
            
            invalido = "cnpj";
            telaCadastrarCliente.getjTFCPNJ().requestFocus();
            toolTip.showToolTip(telaCadastrarCliente.getjTFCPNJ(), "Insira um CNPJ Válido");
            
        }else if(telaCadastrarCliente.getjTFTelefone().getText().equals("(  )     -    ")){
            
            invalido = "telefone";
            telaCadastrarCliente.getjTFTelefone().requestFocus();
            toolTip.showToolTip(telaCadastrarCliente.getjTFTelefone(), "Insira um Telefone");
        
        }else if(modeloCliente.getCodigoEndereco() < 0){
            
            invalido = "endereco";
            telaCadastrarCliente.getjTFEndereco().requestFocus();
            toolTip.showToolTip(telaCadastrarCliente.getjTFEndereco(), "Insira um CEP e o Busque");
            
            
        }else{
            
            invalido = "";
            return true;
            
        }
        
        return false;
        
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
        
        toolTip.hideToolTip();
        telaCadastrarCliente.dispose();
        
    }
    
}
