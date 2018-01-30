/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.MFornece;
import Model.MFornecedores;
import Model.MMateriaPrima;
import Model.MNecessita;
import Model.MTintas;
import View.TelasCadastrar.TCadastrarTinta;
import View.TelasNovo.TNovoMateriaPrima;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Djair Maykon
 */
class ControleNovoMateriaPrima {
    
    private TNovoMateriaPrima telaNovoMateriaPrima;
    private MMateriaPrima modeloMateriaPrima;
    private MFornece modeloFornece;

    public ControleNovoMateriaPrima() {
    
        telaNovoMateriaPrima = new TNovoMateriaPrima();
    
        modeloMateriaPrima = new MMateriaPrima();
        modeloFornece = new MFornece();
      
        ArrayList<MMateriaPrima> listar = modeloMateriaPrima.listar();
        
        if(listar.isEmpty()){
            
            modeloMateriaPrima.setCodigo(0);
            
        }else{
            
            int c = listar.get(listar.size()-1).getCodigo() + 1;
            modeloMateriaPrima.setCodigo(c);
            
        }
        
        telaNovoMateriaPrima.getjTFornecedores().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                
                int linha = telaNovoMateriaPrima.getjTFornecedores().getSelectedRow();
                
                if(linha >= 0){
                    
                    telaNovoMateriaPrima.getjBRemoverrFornecedor().setEnabled(true);
                    
                }
                
            }

        });
        
        telaNovoMateriaPrima.getjTFCodigoMateriaPrima().setText(String.valueOf(modeloMateriaPrima.getCodigo()));
      
        telaNovoMateriaPrima.getjBAdicionarFornecedor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                Integer codigoDaMateriaprima = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do Fornecedor: "));
                String nomeDaMateriaPrima = JOptionPane.showInputDialog("Digite o nome do Fornecedor: ");
                Integer qtdDaMateriaprima = Integer.parseInt(JOptionPane.showInputDialog("Digite o custo da Materia Prima do Fornecedor: "));
                
                DefaultTableModel modelo = (DefaultTableModel) telaNovoMateriaPrima.getjTFornecedores().getModel();
                modelo.addRow(new Object[]{codigoDaMateriaprima, nomeDaMateriaPrima, qtdDaMateriaprima});
                
            }
        });
        
        telaNovoMateriaPrima.getjBRemoverrFornecedor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int linha = telaNovoMateriaPrima.getjTFornecedores().getSelectedRow();
                DefaultTableModel modelo = (DefaultTableModel) telaNovoMateriaPrima.getjTFornecedores().getModel();
                modelo.removeRow(linha);
                telaNovoMateriaPrima.getjTFornecedores().setModel(modelo);
                telaNovoMateriaPrima.getjBRemoverrFornecedor().setEnabled(false);
                
            }
        });
        
        telaNovoMateriaPrima.getjBSalvarNovoMateriaPrima().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                if(validarEntradas()){
                  
                    cadastrarFornecedor();
                  
                }
              
            }
        });
        
        telaNovoMateriaPrima.getjBCancelarNovoMateriaPrima().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                cancelarCadastro();
              
            }
        });
    
    }

    public boolean validarEntradas(){
        
        return true;
        
    }
    
    public void cadastrarFornecedor(){
        
        modeloMateriaPrima.setDescricao(telaNovoMateriaPrima.getjTADescricao().getText());
        modeloMateriaPrima.adicionar();
  
        DefaultTableModel m = (DefaultTableModel) telaNovoMateriaPrima.getjTFornecedores().getModel();
        
        for(int i = 0; i < m.getRowCount(); i++){
            
            modeloFornece.setCodigoMateriaPrima(modeloMateriaPrima.getCodigo());
            modeloFornece.setCodigoFornecedores((int) m.getValueAt(i, 0));
            modeloFornece.setCusto((int) m.getValueAt(i, 2));
            modeloFornece.adicionar();
            
        }
        
        telaNovoMateriaPrima.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        telaNovoMateriaPrima.dispose();
        
    }
    
    public TNovoMateriaPrima getTelaNovoMateriaPrima() {
        return telaNovoMateriaPrima;
    }
    
}
