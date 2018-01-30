/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.MUsuario;
import View.Login.TLogin;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        
        telaLogin.getjBLogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acaoBLogin(e);
            }
        });
        
    }
    
    public void acaoBLogin(ActionEvent evt){
        
        login = telaLogin.getjTFUsuario().getText();
        senha = String.valueOf(telaLogin.getjPFSenha().getPassword());
        
        ArrayList<MUsuario> usuarios = new MUsuario().listar();
        
        for(MUsuario u : usuarios){
            
            if(login.equals(u.getLogin())){
                
                modeloUsuario = u;
                break;
                
            }
            
        }
        
        if(modeloUsuario != null && senha.equals(modeloUsuario.getSenha())){
            
            validado = true;
            JOptionPane.showMessageDialog(null, "Usuario Válido");
            telaLogin.dispose();
            ControlePrincipal.iniciar();
            
        }
        
    }

    public MUsuario getModeloUsuario() {
        return modeloUsuario;
    }
    
    public boolean isValidado() {
        return validado;
    }
    
}
