/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Novo;

import Model.MFornece;
import Model.MMateriaPrima;
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
public class ControleNovoMateriaPrima {
    
    private TNovoMateriaPrima telaNovoMateriaPrima;
    private MMateriaPrima modeloMateriaPrima;
    private MFornece modeloFornece;
    private int custo = 0;
    
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
                String nomeDaMateriaPrima = JOptionPane.showInputDialog("Digite o nome do fornecedor: ");
                Integer qtdDaMateriaprima = Integer.parseInt(JOptionPane.showInputDialog("Digite o custo da Materia Prima do Fornecedor: "));
                
                DefaultTableModel modelo = (DefaultTableModel) telaNovoMateriaPrima.getjTFornecedores().getModel();
                modelo.addRow(new Object[]{codigoDaMateriaprima, nomeDaMateriaPrima, qtdDaMateriaprima});
                
                
                custo += qtdDaMateriaprima;
                
                telaNovoMateriaPrima.getjTFCusto().setText(""+custo);
                
            }
        });
        
        telaNovoMateriaPrima.getjBRemoverrFornecedor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                int linha = telaNovoMateriaPrima.getjTFornecedores().getSelectedRow();
                DefaultTableModel modelo = (DefaultTableModel) telaNovoMateriaPrima.getjTFornecedores().getModel();
                
                custo -= (int)telaNovoMateriaPrima.getjTFornecedores().getValueAt(linha, 2);
                
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
  
        DefaultTableModel m = (DefaultTableModel) telaNovoMateriaPrima.getjTFornecedores().getModel();
  
        for(int i = 0; i < m.getRowCount(); i++){
            
            modeloFornece.setCodigoMateriaPrima(modeloMateriaPrima.getCodigo());
            modeloFornece.setCodigoFornecedores((int) m.getValueAt(i, 0));
            modeloFornece.setCusto((int) m.getValueAt(i, 2));
            modeloFornece.adicionar();
            
        }
        
        custo /= modeloMateriaPrima.getEstoque();
        
        modeloMateriaPrima.setCusto(custo);
        
        modeloMateriaPrima.adicionar();
        
        telaNovoMateriaPrima.getjTFCusto().setText(""+custo);
        
        JOptionPane.showMessageDialog(null, "Custo Calculado");
        
        telaNovoMateriaPrima.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        telaNovoMateriaPrima.dispose();
        
    }
    
    public TNovoMateriaPrima getTelaNovoMateriaPrima() {
        return telaNovoMateriaPrima;
    }
    
}
