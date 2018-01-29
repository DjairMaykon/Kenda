/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.MUsuario;
import View.Login.TLogin;

/**
 *
 * @author Djair Maykon
 */
public class ControleLogin {
    
    private TLogin telaLogin;
    private MUsuario modeloUsuario;
    private ControleToolTip toolTip;

    public ControleLogin() {
        
        this.telaLogin = new TLogin();
        this.modeloUsuario = new MUsuario();
        toolTip = new ControleToolTip();
        
    }
    
    public MUsuario inicia(){
        
        telaLogin.setVisible(true);
        
        return modeloUsuario;
        
    }
    
}
