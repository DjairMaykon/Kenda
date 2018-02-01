/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.MUsuario;


/**
 *
 * @author Djair Maykon
 */
public class ControlePrincipal {

    private static ControleLogin cLogin = null;
    private static ControleTInicial cTInicial = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        login();
        
    }

    public static void login() {
        
        if(cTInicial instanceof ControleTInicial)
            cTInicial = null;
        
        cLogin = new ControleLogin();
        
    }

    public static void iniciar(MUsuario u) {
        // TODO code application logic here
    
        if(cLogin instanceof ControleLogin)
            cLogin = null;
        
        cTInicial = new ControleTInicial(u);
        
    }

    public static ControleTInicial getcTInicial() {
        return cTInicial;
    }
    
}
