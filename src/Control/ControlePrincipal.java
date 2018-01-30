/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.TInicial;


/**
 *
 * @author Djair Maykon
 */
public class ControlePrincipal {

    private static ControleLogin cLogin;
    private static ControleTInicial cTInicial;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        cLogin = new ControleLogin();
        
    }

    public static void iniciar() {
        // TODO code application logic here
    
        cTInicial = new ControleTInicial(cLogin.getModeloUsuario());
        
        
    }
    
}
