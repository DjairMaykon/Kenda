/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import View.Listar.Cliente.TListarCliente;

/**
 *
 * @author Matheus
 */
public class ControleListarCliente {
    
    private TListarCliente telaListarCliente;
    
    
     public ControleListarCliente() {
    
       telaListarCliente = new TListarCliente();
    
    }

    public TListarCliente getListarCliente() {
        return telaListarCliente;
    }

   
    
    
    
}
