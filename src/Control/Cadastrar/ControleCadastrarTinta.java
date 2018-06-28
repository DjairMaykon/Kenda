/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control.Cadastrar;

import Control.Utils.ControleToolTip;
import Model.MFornecedores;
import Model.MMateriaPrima;
import Model.MNecessita;
import Model.MTintas;
import View.TelasCadastrar.TCadastrarTinta;
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
 * @author Matheus
 */
public class ControleCadastrarTinta {
    
    private TCadastrarTinta telaCadastrarTinta; 
    private MTintas modeloTinta;
    private MNecessita modeloNecessita;
    private ArrayList<MMateriaPrima> modeloMateriaPrima;
    
    private ControleToolTip toolTip;
    private String invalido = "";
    
    public ControleCadastrarTinta() {
    
        telaCadastrarTinta = new TCadastrarTinta();
        modeloTinta = new MTintas();
        modeloNecessita = new MNecessita();
        
        toolTip = new ControleToolTip();
        
        telaCadastrarTinta.getjTFFuncionalidade().requestFocus();
        
        
        
        telaCadastrarTinta.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                
                modeloMateriaPrima = new MMateriaPrima().listar();
                
                ArrayList<MTintas> listar = modeloTinta.listar();
                if(listar.isEmpty()){

                    modeloTinta.setCodigo(0);

                }else{

                    int c = listar.get(listar.size()-1).getCodigo() + 1;
                    modeloTinta.setCodigo(c);

                }
                
                telaCadastrarTinta.getjTFCodigoTinta().setText(String.valueOf(modeloTinta.getCodigo()));
                modeloTinta.setCusto(0);

                if(!modeloMateriaPrima.isEmpty()){

                    DefaultComboBoxModel modeloCB = new DefaultComboBoxModel();
                    modeloMateriaPrima.forEach((f) -> {
                        modeloCB.addElement(f.getCodigo());
                    });
                    telaCadastrarTinta.getjCBMateriasPrimas().setModel(modeloCB);

                }else{

                    JOptionPane.showMessageDialog(null, "Não há Materias Primas Cadastrados!!!", "Aviso", JOptionPane.WARNING_MESSAGE);
                    telaCadastrarTinta.dispose();

                }
            }
            @Override
            public void internalFrameClosing(InternalFrameEvent e) {
                toolTip.hideToolTip();
            }
        });
        telaCadastrarTinta.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                toolTip.hideToolTip();
            }
        });
        
        telaCadastrarTinta.getjTMateriasPrimasUtilizadas().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                
                int linha = telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getSelectedRow();
                
                if(linha >= 0){
                    
                    telaCadastrarTinta.getjBRemoverMateriaPrima().setEnabled(true);
                    
                }
                
            }

        });
        
        ArrayList<MMateriaPrima> itensAdicionados = new ArrayList<>();
        
        telaCadastrarTinta.getjBAdicionarMateriaPrima().addActionListener((ActionEvent e) -> {
            
            MMateriaPrima m = modeloMateriaPrima.get(telaCadastrarTinta.getjCBMateriasPrimas().getSelectedIndex());
            
            if(itensAdicionados.indexOf(m) >= 0)
                return;
            
            DefaultTableModel model = (DefaultTableModel) telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getModel();
            
            int quantidade1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a Quantidade utilizada da Materia Prima" + m.getCodigo(), "Inserir Quantidade", JOptionPane.QUESTION_MESSAGE));
            
            model.addRow(new Object[]{m.getCodigo(), quantidade1});
            
            double custo = modeloTinta.getCusto();
            custo += m.getCusto()*quantidade1;
            modeloTinta.setCusto(custo);
            
            itensAdicionados.add(m);
            
            quantidade1 /= telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getRowCount();
            modeloNecessita.setQtdMateriaPrima(quantidade1);
            telaCadastrarTinta.getjTFCusto().setText("" + modeloTinta.getCusto());
            
        });
        
        telaCadastrarTinta.getjBRemoverMateriaPrima().addActionListener((ActionEvent e) -> {
            
            int linhaSelecionada = telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getSelectedRow();
             
            int codigoMP = (int) telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getValueAt(linhaSelecionada, 0);

            MMateriaPrima removerMP = null;
             
            for(MMateriaPrima i : itensAdicionados){
                if(i.getCodigo() == codigoMP){
                    removerMP = i;
                }
            }

            itensAdicionados.remove(removerMP);
            
            DefaultTableModel model = (DefaultTableModel) telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getModel();
            model.removeRow(linhaSelecionada);
            telaCadastrarTinta.getjTMateriasPrimasUtilizadas().setModel(model);

        });
        
        telaCadastrarTinta.getjBCadastrarTinta().addActionListener((ActionEvent e) -> {
            if(validarEntradas())
                cadastrarTinta();
        });
        
        telaCadastrarTinta.getjBCancelarTinta().addActionListener((ActionEvent e) -> {
            cancelarCadastro();
        });
        
        telaCadastrarTinta.getjTFFuncionalidade().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("funcionalidade")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarTinta.getjTFCor().addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
             
                if(invalido.equals("cor")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
        telaCadastrarTinta.getjBAdicionarMateriaPrima().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
             
                if(invalido.equals("tabelaVazia")){
                    invalido = "";
                    toolTip.hideToolTip();
                }
                
            }
        });
    }

    public TCadastrarTinta getTelaCadastrarTinta() {
        return telaCadastrarTinta;
    }
    
    public boolean validarEntradas(){
        
        if(telaCadastrarTinta.getjTFFuncionalidade().getText().isEmpty()){
            
            invalido = "funcionalidade";
            telaCadastrarTinta.getjTFFuncionalidade().requestFocus();
            toolTip.showToolTip(telaCadastrarTinta.getjTFFuncionalidade(), "Insira uma Funcionalidae");
            return false;

        }else if(telaCadastrarTinta.getjTFCor().getText().isEmpty()){
            
            invalido = "cor";
            telaCadastrarTinta.getjTFCor().requestFocus();
            toolTip.showToolTip(telaCadastrarTinta.getjTFCor(), "Insira uma Cor");
            return false;
            
        }else if(telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getRowCount() == 0){
            
            invalido = "tabelaVazia";
            telaCadastrarTinta.getjBAdicionarMateriaPrima().requestFocus();
            toolTip.showToolTip(telaCadastrarTinta.getjBAdicionarMateriaPrima(), "Adicione uma Materia Prima");
            return false;
            
        }
        
        toolTip.hideToolTip();
        return true;
        
    }
    
    public void cadastrarTinta(){
        
        modeloTinta.setFuncionalidade(telaCadastrarTinta.getjTFFuncionalidade().getText());
        modeloTinta.setCor(telaCadastrarTinta.getjTFCor().getText());
        modeloTinta.setCusto(Double.parseDouble(telaCadastrarTinta.getjTFCusto().getText()));
        modeloTinta.adicionar();
        
        modeloNecessita.setCodigoTinta(modeloTinta.getCodigo());
        
        for(int i = 0; i < telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getRowCount(); i++){
            
            modeloNecessita.setCodigoMateriaPrima((int) telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getValueAt(i, 0));
            modeloNecessita.setQtdMateriaPrima((int) telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getValueAt(i, 1));
            modeloNecessita.adicionar();
            
        }
        
        telaCadastrarTinta.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        toolTip.hideToolTip();
        telaCadastrarTinta.dispose();
        
    }

}
