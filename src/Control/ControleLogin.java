/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Control.Utils.ControleToolTip;
import Model.MUsuario;
import View.Login.TLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Djair Maykon
 */
public class ControleLogin {
    
    private TLogin telaLogin;
    private MUsuario modeloUsuario = null;
    private ControleToolTip toolTip;
    private String login;
    private String senha;
    private boolean validado = false;

    public ControleLogin() {
        
        this.telaLogin = new TLogin();
        toolTip = new ControleToolTip();
        telaLogin.setVisible(true);
        
        telaLogin.getjTFUsuario().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(telaLogin.getjTFUsuario().getText().isEmpty())
                    toolTip.hideToolTip();
            }
        });
        telaLogin.getjPFSenha().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(telaLogin.getjPFSenha().getPassword().length == 0 && !telaLogin.getjTFUsuario().getText().isEmpty())
                    toolTip.hideToolTip();
        
            }
        });
        
        telaLogin.getjBLogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoBLogin(e);
            }
        });
        
    }
    
    public void acaoBLogin(ActionEvent evt){
        
        if(!validarCampos())
            return;
        
        boolean usuarioCorreto = false;
        
        login = telaLogin.getjTFUsuario().getText();
        senha = String.valueOf(telaLogin.getjPFSenha().getPassword());
        
        ArrayList<MUsuario> usuarios = new MUsuario().listar();
        
        for(MUsuario u : usuarios){
            
            if(login.equals(u.getLogin()) && senha.equals(u.getSenha())){
                
                usuarioCorreto = true;
                modeloUsuario = u;
                break;
                
            }
            
        }
        
        if(usuarioCorreto){
            
            validado = true;
            JOptionPane.showMessageDialog(null, "Usuario Válido");
            telaLogin.setVisible(false);
            ControlePrincipal.iniciar(modeloUsuario);
            
        }else{    
        
            JOptionPane.showMessageDialog(null, "Acesso negado, Usuario Inválido");
            telaLogin.getjTFUsuario().setText("");
            telaLogin.getjPFSenha().setText("");
            telaLogin.getjTFUsuario().requestFocus();
        
        }
        
    }

     public TLogin gettelaTLogin() {
        return telaLogin;
    }
    
    
    public boolean isValidado() {
        return validado;
    }
    
    private boolean validarCampos() {
        
        if(telaLogin.getjTFUsuario().getText().isEmpty()){
            
            toolTip.showToolTip(telaLogin.getjTFUsuario(), "Insira um login!!!");
            telaLogin.getjTFUsuario().requestFocus();
            
            return false;
    
        }
        if(telaLogin.getjPFSenha().getPassword().length <= 0){
        
            toolTip.showToolTip(telaLogin.getjPFSenha(), "Insira uma senha!!!");
            telaLogin.getjPFSenha().requestFocus();
            
            return false;
                
        }
        
        return true;
        
    }
    
}
