/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.MTransportadoras;
import View.Listar.Expedicao.TListarExpedicaoTransportadora;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Djair Maykon
 */
class ControleListarExpedicaoTransportadora {
    
    private TListarExpedicaoTransportadora telaListarExpedicaoTransportadora;

    public ControleListarExpedicaoTransportadora() {
    
        telaListarExpedicaoTransportadora = new TListarExpedicaoTransportadora();
        carregarNaTela();
    
    }

    public TListarExpedicaoTransportadora gettelaListarExpedicaoTransportadora() {
        return telaListarExpedicaoTransportadora;
    }
    
    public void carregarNaTela(){
       ArrayList<MTransportadoras> fornecedores = new MTransportadoras().listar();
       DefaultTableModel modelo=(DefaultTableModel) telaListarExpedicaoTransportadora.getjTListarExpedicaoTransportadora().getModel();
      for(MTransportadoras c : fornecedores){
          modelo.addRow(new Object[]{c.getCodigo(), c.getCodEnd(), c.getNome(), c.getCnpj(), c.getTelefone(), c.getFrete()});
          telaListarExpedicaoTransportadora.getjTListarExpedicaoTransportadora().setModel(modelo);
      }
      
     }
    
}
