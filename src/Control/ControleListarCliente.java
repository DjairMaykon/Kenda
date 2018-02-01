/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.MCliente;
import View.Listar.Cliente.TListarCliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Matheus
 */
public class ControleListarCliente {
    
    private TListarCliente telaListarCliente;
    private ResultSet rs;
    
    
     public ControleListarCliente() {
    
       telaListarCliente = new TListarCliente();
       carregarNaTela();
       
    
    }

   

    public TListarCliente getListarCliente() {
        return telaListarCliente;
    }

    public void carregarNaTela(){
       ArrayList<MCliente> clientes = new MCliente().listar();
       DefaultTableModel modelo=(DefaultTableModel) telaListarCliente.getjTListarCliente().getModel();
      for(MCliente c : clientes){
          modelo.addRow(new Object[]{c.getCodigo(), c.getEmail(), c.getNome(), c.getTelefone(), c.getCnpj(), c.getCodigoEndereco()});
          telaListarCliente.getjTListarCliente().setModel(modelo);
      }
    
    
    }
}
