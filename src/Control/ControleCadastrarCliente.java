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
    
    private TCadastrarCliente cadastrarCliente;
    
    
     public ControleCadastrarCliente() {
    
       cadastrarCliente = new TCadastrarCliente();
    
    }

    public TCadastrarCliente getCadastrarCliente() {
        return cadastrarCliente;
    }

   
    
    
    
}
