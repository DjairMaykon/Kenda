/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.MMateriaPrima;
import View.Listar.Estoque.TListarEstoqueMateriaPrima;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Djair Maykon
 */
class ControleListarEstoqueMateriaPrima {
    
    private TListarEstoqueMateriaPrima telaListarEstoqueMateriaPrima;

    public ControleListarEstoqueMateriaPrima() {
    
        telaListarEstoqueMateriaPrima = new TListarEstoqueMateriaPrima();
        carregarNaTela();
    
    }

    public TListarEstoqueMateriaPrima gettelaListarEstoqueMateriaPrima() {
        return telaListarEstoqueMateriaPrima;
    }
    
     public void carregarNaTela(){
       ArrayList<MMateriaPrima> fornecedores = new MMateriaPrima().listar();
       DefaultTableModel modelo=(DefaultTableModel) telaListarEstoqueMateriaPrima.getjTListarEstoqueMateriaPrima().getModel();
      for(MMateriaPrima c : fornecedores){
          modelo.addRow(new Object[]{c.getCodigo(), c.getCusto(), c.getDescricao(), c.getEstoque()});
          telaListarEstoqueMateriaPrima.getjTListarEstoqueMateriaPrima().setModel(modelo);
      }
      
     }
    
}
