/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Novo;

import Control.Utils.ControleToolTip;
import Model.MFornece;
import Model.MFornecedores;
import Model.MMateriaPrima;
import View.TelasNovo.TNovoMateriaPrima;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Djair Maykon
 */
public class ControleNovoMateriaPrima {
    
    private TNovoMateriaPrima telaNovoMateriaPrima;
    private MMateriaPrima modeloMateriaPrima;
    private MFornece modeloFornece;
    ArrayList<MFornecedores> modeloFornecedores;
    
    private ControleToolTip toolTip;
    private String invalido = "";
    
    public ControleNovoMateriaPrima() {
    
        telaNovoMateriaPrima = new TNovoMateriaPrima();
    
        modeloMateriaPrima = new MMateriaPrima();
        modeloMateriaPrima.setCusto(0);
        modeloFornece = new MFornece();
        
        toolTip = new ControleToolTip();
      
        telaNovoMateriaPrima.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                
                modeloFornecedores = new MFornecedores().listar();
                ArrayList<MMateriaPrima> listar = modeloMateriaPrima.listar();
                if(listar.isEmpty()){

                    modeloMateriaPrima.setCodigo(0);

                }else{

                    int c = listar.get(listar.size()-1).getCodigo() + 1;
                    modeloMateriaPrima.setCodigo(c);

                }
                telaNovoMateriaPrima.getjTFCodigoMateriaPrima().setText(String.valueOf(modeloMateriaPrima.getCodigo()));

                if(!modeloFornecedores.isEmpty()){

                    DefaultComboBoxModel modeloCB = new DefaultComboBoxModel();
                    modeloFornecedores.forEach((f) -> {
                        modeloCB.addElement(f.getNome());
                    });
                    telaNovoMateriaPrima.getjCBFornecedores().setModel(modeloCB);

                }else{

                    JOptionPane.showMessageDialog(null, "Não há Fornecedores Cadastrados!!!", "Aviso", JOptionPane.WARNING_MESSAGE);
                    telaNovoMateriaPrima.dispose();

                }
            }
            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                toolTip.hideToolTip();
            }
        });
        telaNovoMateriaPrima.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                toolTip.hideToolTip();
            }
        });
        
        telaNovoMateriaPrima.getjTFornecedores().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                
                int linha = telaNovoMateriaPrima.getjTFornecedores().getSelectedRow();
                
                if(linha >= 0){
                    
                    telaNovoMateriaPrima.getjBRemoverrFornecedor().setEnabled(true);
                    
                }
                
            }

        });
        
        ArrayList<MFornecedores> itensAdicionados = new ArrayList<>();
        
        telaNovoMateriaPrima.getjBAdicionarFornecedor().addActionListener((ActionEvent e) -> {
            
            MFornecedores m = modeloFornecedores.get(telaNovoMateriaPrima.getjCBFornecedores().getSelectedIndex());
            
            if(itensAdicionados.indexOf(m) >= 0)
                return;
            
            DefaultTableModel model = (DefaultTableModel) telaNovoMateriaPrima.getjTFornecedores().getModel();
            
            double custo1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor do Custo dessa Materia Prima no Fornecedor " + m.getNome(), "Inserir Custo", JOptionPane.QUESTION_MESSAGE));
            
            model.addRow(new Object[]{m.getCodigo(), m.getNome(), custo1});
            
            itensAdicionados.add(m);
            
            custo1 = 0;
            
            for(int i = 0; i < telaNovoMateriaPrima.getjTFornecedores().getRowCount(); i++){
                
                custo1 += (double) telaNovoMateriaPrima.getjTFornecedores().getValueAt(i, 2);
                
            }
            
            custo1 /= telaNovoMateriaPrima.getjTFornecedores().getRowCount();
            modeloMateriaPrima.setCusto(custo1);
            telaNovoMateriaPrima.getjTFCusto().setText("" + custo1);
            
        });
        
        telaNovoMateriaPrima.getjBRemoverrFornecedor().addActionListener((ActionEvent e) -> {
        
             int linhaSelecionada = telaNovoMateriaPrima.getjTFornecedores().getSelectedRow();
             
             int codigoFE = (int) telaNovoMateriaPrima.getjTFornecedores().getValueAt(linhaSelecionada, 0);

             MFornecedores removerMF = null;
             
            for(MFornecedores i : itensAdicionados){
                 if(i.getCodigo() == codigoFE){
                     removerMF = i;
                     System.out.println("2");
                 }
             }

            itensAdicionados.remove(removerMF);
            
             DefaultTableModel model = (DefaultTableModel) telaNovoMateriaPrima.getjTFornecedores().getModel();
             model.removeRow(linhaSelecionada);
             telaNovoMateriaPrima.getjTFornecedores().setModel(model);

        });
        
        telaNovoMateriaPrima.getjBSalvarNovoMateriaPrima().addActionListener((ActionEvent e) -> {
            if(validarEntradas())
                cadastrarFornecedor();
        });
        
        telaNovoMateriaPrima.getjBCancelarNovoMateriaPrima().addActionListener((ActionEvent e) -> {
            cancelarCadastro();
        });
        
        telaNovoMateriaPrima.getjTADescricao().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("descricao")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaNovoMateriaPrima.getjTFEstoque().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("estoque")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaNovoMateriaPrima.getjBAdicionarFornecedor().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                if(invalido.equals("tabelaVazia")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
    
    }

    public boolean validarEntradas(){
        
        if(telaNovoMateriaPrima.getjTADescricao().getText().isEmpty()){
            
            invalido = "descricao";
            telaNovoMateriaPrima.getjTADescricao().requestFocus();
            toolTip.showToolTip(telaNovoMateriaPrima.getjTADescricao(), "Insira uma Descrição");
            return false;

        }else if(telaNovoMateriaPrima.getjTFornecedores().getRowCount() == 0){
            
            invalido = "tabelaVazia";
            telaNovoMateriaPrima.getjBAdicionarFornecedor().requestFocus();
            toolTip.showToolTip(telaNovoMateriaPrima.getjBAdicionarFornecedor(), "Adicione um Fornecedor");
            return false;
            
        }else if(telaNovoMateriaPrima.getjTFEstoque().getText().isEmpty()){
            
            invalido = "estoque";
            telaNovoMateriaPrima.getjTFEstoque().requestFocus();
            toolTip.showToolTip(telaNovoMateriaPrima.getjTFEstoque(), "Insira um valor de Estoque");
            return false;
            
        }
        
        toolTip.hideToolTip();
        return true;
        
        
    }
    
    public void cadastrarFornecedor(){
        
        modeloMateriaPrima.setDescricao(telaNovoMateriaPrima.getjTADescricao().getText());
        modeloMateriaPrima.setEstoque(Integer.parseInt(telaNovoMateriaPrima.getjTFEstoque().getText()));
        modeloMateriaPrima.adicionar();
        
        modeloFornece.setCodigoMateriaPrima(modeloMateriaPrima.getCodigo());
        
        for(int i = 0; i < telaNovoMateriaPrima.getjTFornecedores().getRowCount(); i++){
            
            modeloFornece.setCodigoFornecedores((int) telaNovoMateriaPrima.getjTFornecedores().getValueAt(i, 0));
            modeloFornece.setCusto((double) telaNovoMateriaPrima.getjTFornecedores().getValueAt(i, 2));
            modeloFornece.adicionar();
            
        }
        
        telaNovoMateriaPrima.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        toolTip.hideToolTip();
        telaNovoMateriaPrima.dispose();
        
    }
    
    public TNovoMateriaPrima getTelaNovoMateriaPrima() {
        return telaNovoMateriaPrima;
    }
    
}
