/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import View.TelasCadastrar.TCadastrarCliente;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarCliente {
    
    private TCadastrarCliente telaCadastrarCliente;
    
    
     public ControleCadastrarCliente() {
    
       telaCadastrarCliente = new TCadastrarCliente();
    
    }

    public TCadastrarCliente getTelaCadastrarCliente() {
        return telaCadastrarCliente;
    }

   
    
    
    
}
