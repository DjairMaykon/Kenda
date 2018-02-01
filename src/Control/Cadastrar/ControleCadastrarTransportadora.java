/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Cadastrar;
import Control.Utils.ControleToolTip;
import Control.Utils.UtilEndereco;
import Model.MEndereco;
import Model.MTransportadoras;
import View.TelasCadastrar.TCadastrarTransportadora;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
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
public class ControleCadastrarTransportadora {
    
    private TCadastrarTransportadora telaCadastrarTransportadora; 
    private MTransportadoras modeloMTransportadoras; 
    
    private ControleToolTip toolTip;
    private String invalido = "";
    
    public ControleCadastrarTransportadora () {  
        
        telaCadastrarTransportadora = new TCadastrarTransportadora();
        modeloMTransportadoras = new MTransportadoras();
        
        toolTip = new ControleToolTip();
        
        telaCadastrarTransportadora.getjTFNome().requestFocus();
        
        ArrayList<MTransportadoras> listar = modeloMTransportadoras.listar();
        if(listar.isEmpty()){
            
            modeloMTransportadoras.setCodigo(0);
            
        }else{
            
            int c = listar.get(listar.size()-1).getCodigo()+ 1;
            modeloMTransportadoras.setCodigo(c);
            
        }
        
        modeloMTransportadoras.setCodEnd(-1);
        telaCadastrarTransportadora.getjTFCodigoTransportadora().setText(String.valueOf(modeloMTransportadoras.getCodigo()));
              
        telaCadastrarTransportadora.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                toolTip.hideToolTip();
            }
        });
        telaCadastrarTransportadora.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                toolTip.hideToolTip();
            }
        });
        
        telaCadastrarTransportadora.getjBCadastrarTransportadora().addActionListener((ActionEvent e) -> {
            if(validarEntradas())
                cadastrarTransportadora();
        });
        telaCadastrarTransportadora.getjBCancelarTransportadora().addActionListener((ActionEvent e) -> {
            cancelarCadastro();
        });
        
        telaCadastrarTransportadora.getjBuscarEndereco().addActionListener((ActionEvent e) -> {
            if(telaCadastrarTransportadora.getjTFCodigoEndereco().getText().isEmpty()){
                
                toolTip.showToolTip(telaCadastrarTransportadora.getjTFCodigoEndereco(), "Digite um CEP Válido");
                
            }
            
            MEndereco end = UtilEndereco.buscarEndereco(telaCadastrarTransportadora.getjTFCodigoEndereco().getText());
            
            JOptionPane.showMessageDialog(null, "CEP: "+end.getCep()+"\n"+
                                                "UF: "+end.getUf() + "\n"+
                                                "Cidade: "+end.getCidade() + "\n"+
                                                "Bairro: "+end.getBairro()+"\n"+
                                                "Rua: "+end.getRua());
            
            modeloMTransportadoras.setCodEnd(end.getCodigo());
        });
        
        telaCadastrarTransportadora.getjTFNome().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("nome")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarTransportadora.getjTFUnidadeFrete().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("unidade")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarTransportadora.getjTFCPNJ().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("cnpj")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarTransportadora.getjTFTelefone().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("telefone")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarTransportadora.getjTFCodigoEndereco().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("endereco")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarTransportadora.getjTFFrete().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("frete")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        
        telaCadastrarTransportadora.getjBuscarEndereco().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                if(invalido.equals("endereco")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
      
    }
    
    public TCadastrarTransportadora getTelaCadastrarTransportadora() {
        return telaCadastrarTransportadora;
    }

    public boolean validarEntradas(){
        
        if(telaCadastrarTransportadora.getjTFNome().getText().isEmpty()){
            
            invalido = "nome";
            telaCadastrarTransportadora.getjTFNome().requestFocus();
            toolTip.showToolTip(telaCadastrarTransportadora.getjTFNome(), "Insira um Nome");
            
        }else if(telaCadastrarTransportadora.getjTFUnidadeFrete().getText().isEmpty()){
            
            invalido = "unidade";
            telaCadastrarTransportadora.getjTFUnidadeFrete().requestFocus();
            toolTip.showToolTip(telaCadastrarTransportadora.getjTFUnidadeFrete(), "Insira uma Unidade de Frete");
            
        }else if(telaCadastrarTransportadora.getjTFCPNJ().getText().equals("  .   .   /    -  ")){
            
            invalido = "cnpj";
            telaCadastrarTransportadora.getjTFCPNJ().requestFocus();
            toolTip.showToolTip(telaCadastrarTransportadora.getjTFCPNJ(), "Insira um CNPJ Válido");
            
        }else if(telaCadastrarTransportadora.getjTFTelefone().getText().equals("(  )     -    ")){
            
            invalido = "telefone";
            telaCadastrarTransportadora.getjTFTelefone().requestFocus();
            toolTip.showToolTip(telaCadastrarTransportadora.getjTFTelefone(), "Insira um Telefone");
        
        }else if(modeloMTransportadoras.getCodEnd()< 0){
            
            invalido = "endereco";
            telaCadastrarTransportadora.getjTFCodigoEndereco().requestFocus();
            toolTip.showToolTip(telaCadastrarTransportadora.getjTFCodigoEndereco(), "Insira um CEP e o Busque");
            
            
        }else if(telaCadastrarTransportadora.getjTFFrete().getText().isEmpty()){
            
            invalido = "frete";
            telaCadastrarTransportadora.getjTFFrete().requestFocus();
            toolTip.showToolTip(telaCadastrarTransportadora.getjTFFrete(), "Insira um Frete");
            
        }else{
            
            invalido = "";
            return true;
            
        }
        
        return false;
        
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
        
        toolTip.hideToolTip();
        telaCadastrarTransportadora.dispose();
        
    }

}
    
