/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Cadastrar;
import Control.Utils.ControleToolTip;
import Control.Utils.UtilEndereco;
import Model.MEndereco;
import Model.MFornecedores;
import View.TelasCadastrar.TCadastrarFornecedor;
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
public class ControleCadastrarFornecedor {
    
    private TCadastrarFornecedor telaCadastrarFornecedor; 
    private MFornecedores modeloFornecedores;
    
    private ControleToolTip toolTip;
    private String invalido = "";
    
    public ControleCadastrarFornecedor() {
    
        telaCadastrarFornecedor = new TCadastrarFornecedor();
        modeloFornecedores = new MFornecedores();
        
        toolTip = new ControleToolTip();
        
        telaCadastrarFornecedor.getjTFNome().requestFocus();
        
        ArrayList<MFornecedores> listar = modeloFornecedores.listar();
        if(listar.isEmpty()){
            
            modeloFornecedores.setCodigo(0);
            
        }else{
            
            int c = listar.get(listar.size()-1).getCodigo() + 1;
            modeloFornecedores.setCodigo(c);
            
        }
        
        modeloFornecedores.setCodigoEndereco(-1);
        telaCadastrarFornecedor.getjTFCodigoFornecedor().setText(String.valueOf(modeloFornecedores.getCodigo()));
            
        telaCadastrarFornecedor.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                toolTip.hideToolTip();
            }
        });
        
        telaCadastrarFornecedor.getjBCadastrarFornecedor().addActionListener((ActionEvent e) -> {
            if(validarEntradas())
                cadastrarFornecedor();
        });
        telaCadastrarFornecedor.getjBCancelarFornecedor().addActionListener((ActionEvent e) -> {
            cancelarCadastro();
        });
        
        telaCadastrarFornecedor.getjBuscarEndereco().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if(telaCadastrarFornecedor.getjTFCodigoEndereco().getText().isEmpty()){
                
                    toolTip.showToolTip(telaCadastrarFornecedor.getjTFCodigoEndereco(), "Digite um CEP Válido");
                
                }
                
                MEndereco end = UtilEndereco.buscarEndereco(telaCadastrarFornecedor.getjTFCodigoEndereco().getText());
                
                JOptionPane.showMessageDialog(null, "CEP: "+end.getCep()+"\n"+
                                              "UF: "+end.getUf() + "\n"+
                                              "Cidade: "+end.getCidade() + "\n"+
                                              "Bairro: "+end.getBairro()+"\n"+
                                              "Rua: "+end.getRua());
                
                modeloFornecedores.setCodigoEndereco(end.getCodigo());
                
            }
        });
        
        telaCadastrarFornecedor.getjTFNome().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("nome")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarFornecedor.getjTFCNPJ().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("cnpj")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarFornecedor.getjTFTelefone().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("telefone")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarFornecedor.getjTFCodigoEndereco().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("endereco")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        
        telaCadastrarFornecedor.getjBuscarEndereco().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                if(invalido.equals("endereco")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
      
    }
    
    public TCadastrarFornecedor getTelaCadastrarFornecedor() {
        return telaCadastrarFornecedor;
    }

    public boolean validarEntradas(){
        
        if(telaCadastrarFornecedor.getjTFNome().getText().isEmpty()){
            
            invalido = "nome";
            telaCadastrarFornecedor.getjTFNome().requestFocus();
            toolTip.showToolTip(telaCadastrarFornecedor.getjTFNome(), "Insira um Nome");
            
        }else if(telaCadastrarFornecedor.getjTFCNPJ().getText().equals("  .   .   /    -  ")){
            
            invalido = "cnpj";
            telaCadastrarFornecedor.getjTFCNPJ().requestFocus();
            toolTip.showToolTip(telaCadastrarFornecedor.getjTFCNPJ(), "Insira um CNPJ Válido");
            
        }else if(telaCadastrarFornecedor.getjTFTelefone().getText().equals("(  )     -    ")){
            
            invalido = "telefone";
            telaCadastrarFornecedor.getjTFTelefone().requestFocus();
            toolTip.showToolTip(telaCadastrarFornecedor.getjTFTelefone(), "Insira um Telefone");
        
        }else if(modeloFornecedores.getCodigoEndereco() < 0){
            
            invalido = "endereco";
            telaCadastrarFornecedor.getjTFCodigoEndereco().requestFocus();
            toolTip.showToolTip(telaCadastrarFornecedor.getjTFCodigoEndereco(), "Insira um CEP e o Busque");
            
        }else{
            
            invalido = "";
            return true;
            
        }
        
        return false;
        
    }
    
    public void cadastrarFornecedor(){
        
        modeloFornecedores.setCnpj(telaCadastrarFornecedor.getjTFCNPJ().getText());
        modeloFornecedores.setEmail(telaCadastrarFornecedor.getjTFEmail().getText());
        modeloFornecedores.setNome(telaCadastrarFornecedor.getjTFNome().getText());
        modeloFornecedores.setSite(telaCadastrarFornecedor.getjTFSite().getText());
        modeloFornecedores.setTelefone(telaCadastrarFornecedor.getjTFTelefone().getText());
        modeloFornecedores.adicionar();
        
        telaCadastrarFornecedor.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        toolTip.hideToolTip();
        telaCadastrarFornecedor.dispose();
        
    }
    
}
