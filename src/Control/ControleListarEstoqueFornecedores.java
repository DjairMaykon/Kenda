/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.MCliente;
import Model.MFornecedores;
import View.Listar.Estoque.TListarEstoqueFornecedores;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Djair Maykon
 */
class ControleListarEstoqueFornecedores {
    
    private TListarEstoqueFornecedores telaListarEstoqueFornecedores;

    public ControleListarEstoqueFornecedores() {
    
        telaListarEstoqueFornecedores = new TListarEstoqueFornecedores();
        carregarNaTela();
    
    }

    public TListarEstoqueFornecedores gettelaListarEstoqueFornecedores() {
        return telaListarEstoqueFornecedores;
    }
    
     public void carregarNaTela(){
       ArrayList<MFornecedores> fornecedores = new MFornecedores().listar();
       DefaultTableModel modelo=(DefaultTableModel) telaListarEstoqueFornecedores.getjTListarEstoqueFornecedor().getModel();
      for(MFornecedores c : fornecedores){
          modelo.addRow(new Object[]{c.getCodigo(), c.getEmail(), c.getNome(), c.getTelefone(), c.getCnpj(), c.getCodigoEndereco()});
          telaListarEstoqueFornecedores.getjTListarEstoqueFornecedor().setModel(modelo);
      }
      
     }
    
}
