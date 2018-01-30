/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.MNecessita;
import Model.MTintas;
import View.TelasCadastrar.TCadastrarTinta;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Matheus
 */
public class ControleCadastrarTinta {
    
    private TCadastrarTinta telaCadastrarTinta; 
    private MTintas modeloTinta;
    private MNecessita modeloNecessita;
    
    public ControleCadastrarTinta() {
    
        telaCadastrarTinta = new TCadastrarTinta();
       
        modeloTinta = new MTintas();
        modeloNecessita = new MNecessita();
      
        ArrayList<MTintas> listar = modeloTinta.listar();
        
        if(listar.isEmpty()){
            
            modeloTinta.setCodigo(0);
            
        }else{
            
            int c = listar.get(listar.size()-1).getCodigo() + 1;
            modeloTinta.setCodigo(c);
            
        }
        
        telaCadastrarTinta.getjTMateriasPrimasUtilizadas().addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                
                int linha = telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getSelectedRow();
                
                if(linha >= 0){
                    
                    telaCadastrarTinta.getjBRemoverMateriaPrima().setEnabled(true);
                    
                }
                
            }

        });
        
        telaCadastrarTinta.getjTFCodigoTinta().setText(String.valueOf(modeloTinta.getCodigo()));
      
        telaCadastrarTinta.getjBAdicionarMateriaPrima().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                Integer codigoDaMateriaprima = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Materia Prima: "));
                String nomeDaMateriaPrima = JOptionPane.showInputDialog("Digite o nome da Materia Prima: ");
                Integer qtdDaMateriaprima = Integer.parseInt(JOptionPane.showInputDialog("Digite o quantidade da Materia Prima: "));
                
                DefaultTableModel modelo = (DefaultTableModel) telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getModel();
                modelo.addRow(new Object[]{codigoDaMateriaprima, nomeDaMateriaPrima, qtdDaMateriaprima});
                
            }
        });
        
        telaCadastrarTinta.getjBRemoverMateriaPrima().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.out.println("000000");
                int linha = telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getSelectedRow();
                System.out.println("-"+linha);
                DefaultTableModel modelo = (DefaultTableModel) telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getModel();
                modelo.removeRow(linha);
                telaCadastrarTinta.getjTMateriasPrimasUtilizadas().setModel(modelo);
                telaCadastrarTinta.getjBRemoverMateriaPrima().setEnabled(false);
                
            }
        });
        
        telaCadastrarTinta.getjBCadastrarTinta().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                if(validarEntradas()){
                  
                    cadastrarFornecedor();
                  
                }
              
            }
        });
        
        telaCadastrarTinta.getjBCancelarTinta().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              
                cancelarCadastro();
              
            }
        });
    
    }

    public TCadastrarTinta getTelaCadastrarTinta() {
        return telaCadastrarTinta;
    }
    
    public boolean validarEntradas(){
        
        return true;
        
    }
    
    public void cadastrarFornecedor(){
        
        modeloTinta.setFuncionalidade(telaCadastrarTinta.getjTFFuncionalidade().getText());
        modeloTinta.setCor(telaCadastrarTinta.getjTFCor().getText());
        modeloTinta.adicionar();
  
        DefaultTableModel m = (DefaultTableModel) telaCadastrarTinta.getjTMateriasPrimasUtilizadas().getModel();
        
        for(int i = 0; i < m.getRowCount(); i++){
            
            modeloNecessita.setCodigoMateriaPrima((int) m.getValueAt(i, 0));
            modeloNecessita.setCodigoTinta(modeloTinta.getCodTinta());
            modeloNecessita.setQtd_materia_prima((int) m.getValueAt(i, 2));
            modeloNecessita.adicionar();
            
        }
        
        telaCadastrarTinta.dispose();
        
    }
    
    public void cancelarCadastro(){
        
        telaCadastrarTinta.dispose();
        
    }

}
